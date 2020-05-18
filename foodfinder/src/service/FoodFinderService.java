package service;

import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.VendorIngredientData;
import javagrpc.Ingredients.Ingredient;
import javagrpc.Ingredients.VendorIngredientMap;
import javagrpc.VendorsOuterClass.Vendors;
import javagrpc.foodFinderGrpc.foodFinderImplBase;
import javagrpc.foodSupplierGrpc.foodSupplierBlockingStub;
import javagrpc.foodVendorGrpc.foodVendorBlockingStub;

/**
 * Finds the price and quantity of an ingredient from the first available vendor. Assumes at least one vendor has the
 * item in stock
 */
public class FoodFinderService extends foodFinderImplBase
{
    private foodSupplierBlockingStub supplierStub;

    private foodVendorBlockingStub vendorStub;

    public FoodFinderService(foodSupplierBlockingStub supplierStub, foodVendorBlockingStub vendorStub)
    {
        this.supplierStub = supplierStub;
        this.vendorStub = vendorStub;
    }

    // public FoodFinderService()
    // {
    //
    // }

    @Override
    public void getIngredient(Ingredient ingredient, StreamObserver<VendorIngredientMap> responseObserver)
    {
        Vendors vendors = supplierStub.getVendorsByIngredient(ingredient);

        VendorIngredientData.Builder vendorIngredient = VendorIngredientData.newBuilder();
        vendorIngredient.setIngredient(ingredient);
        vendorIngredient.addAllVendor(vendors.getVendorList());
        VendorIngredientMap vendorIngredientMap = vendorStub.getIngredientFromVendors(vendorIngredient.build());

        responseObserver.onNext(vendorIngredientMap);
        responseObserver.onCompleted();
    }
}
