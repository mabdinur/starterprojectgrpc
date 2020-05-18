package service;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import helpers.JSONReaderHelper;
import io.grpc.stub.StreamObserver;
import javagrpc.Foodsupplier.Ingredient;
import javagrpc.Foodsupplier.Vendors;
import javagrpc.Foodsupplier.Vendors.Vendor;
import javagrpc.foodSupplierGrpc.foodSupplierImplBase;

/**
 * Maps vendors to ingredients
 */
public class FoodSupplierService extends foodSupplierImplBase
{

    public static final String SUPPLIER_FILE = "src/resources/suppliers.json";

    private JSONObject vendorToItemsJson;

    public FoodSupplierService()
    {
        vendorToItemsJson = JSONReaderHelper.getData(SUPPLIER_FILE);
    }

    @Override
    public void getVendorsByIngredient(Ingredient ingredient, StreamObserver<Vendors> responseObserver)
    {
        Vendors.Builder vendors = Vendors.newBuilder();
        for (Object vendorObj : vendorToItemsJson.keySet())
        {
            String vendorName = (String) vendorObj;
            if (vendorHasItem(vendorName, ingredient)) {
                Vendor.Builder vendor = Vendor.newBuilder();
                vendor.setName(vendorName);
                vendors.addVendor(vendor);
            }
        }

        responseObserver.onNext(vendors.build());
        responseObserver.onCompleted();
    }

    private Boolean vendorHasItem(String vendorName, Ingredient ingredient)
    {
        JSONArray vendorItemsArray = (JSONArray) vendorToItemsJson.get(vendorName);
        return vendorItemsArray.contains(ingredient.getName());
    }
}
