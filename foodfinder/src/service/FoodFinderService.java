package service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.VendorIngredientData;
import javagrpc.Ingredients.Ingredient;
import javagrpc.Ingredients.IngredientMap;
import javagrpc.VendorsOuterClass.Vendor;
import javagrpc.VendorsOuterClass.Vendors;
import javagrpc.foodFinderGrpc.foodFinderImplBase;
import javagrpc.foodSupplierGrpc;
import javagrpc.foodSupplierGrpc.foodSupplierBlockingStub;
import javagrpc.foodVendorGrpc;
import javagrpc.foodVendorGrpc.foodVendorBlockingStub;

/**
 * Finds the price and quantity of an ingredient from the first available vendor. Assumes at least one vendor has the
 * item in stock
 */
public class FoodFinderService extends foodFinderImplBase
{
    private static final String ADDRESS = "localhost";

    private static final int VENDOR_PORT = 9090;
    private static final int SUPPLIER_PORT = 9191;

    @Override
    public void getIngredient(Ingredient ingredient, StreamObserver<IngredientMap> responseObserver)
    {
        Vendor vendor = getFirstAvailableVendor(ingredient);

        IngredientMap ingredientMap = getIngredientInfo(ingredient, vendor);

        responseObserver.onNext(ingredientMap);
        responseObserver.onCompleted();
    }

    private Vendor getFirstAvailableVendor(Ingredient ingredient)
    {
        ManagedChannel supplierChannel =
            ManagedChannelBuilder.forAddress(ADDRESS, SUPPLIER_PORT).usePlaintext().build();
        foodSupplierBlockingStub supplierStub = foodSupplierGrpc.newBlockingStub(supplierChannel);

        Vendors vendors = supplierStub.getVendorsByIngredient(ingredient);
        Vendor vendor = vendors.getVendor(0);
        return vendor;
    }

    private IngredientMap getIngredientInfo(Ingredient ingredient, Vendor vendor)
    {
        ManagedChannel vendorChannel =
            ManagedChannelBuilder.forAddress(ADDRESS, VENDOR_PORT).usePlaintext().build();
        foodVendorBlockingStub vendorStub = foodVendorGrpc.newBlockingStub(vendorChannel);

        VendorIngredientData.Builder vendorIngredient = VendorIngredientData.newBuilder();
        vendorIngredient.setIngredient(ingredient);
        vendorIngredient.setVendor(vendor);

        IngredientMap ingredientMap = vendorStub.getIngredientFromVendor(vendorIngredient.build());
        return ingredientMap;
    }
}