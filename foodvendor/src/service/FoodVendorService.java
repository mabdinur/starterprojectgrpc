package service;

import org.json.simple.JSONObject;

import helpers.JSONReaderHelper;
import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.IngredientData;
import javagrpc.Foodvendor.VendorIngredientData;
import javagrpc.Foodvendor.VendorIngredientData.Vendor;
import javagrpc.Foodvendor.VendorIngredientMap;
import javagrpc.foodVendorGrpc.foodVendorImplBase;

/**
 * Maps Item quantity and price to vendors
 */
public class FoodVendorService extends foodVendorImplBase
{
    public static final String PRICE = "price";
    public static final String QUANTITY = "quantity";

    private static final String VENDOR_FILE = "src/resources/vendors.json";

    private JSONObject vendorToItemsJson = new JSONObject();

    public FoodVendorService()
    {
        vendorToItemsJson = JSONReaderHelper.getData(VENDOR_FILE);
    }

    @Override
    public void getIngredientFromVendors(
        VendorIngredientData vendorIngredientData,
        StreamObserver<VendorIngredientMap> responseObserver)
    {
        VendorIngredientMap.Builder vendorIngredientMap = VendorIngredientMap.newBuilder();
        String ingredientName = vendorIngredientData.getIngredient().getName();

        for (Vendor vendor : vendorIngredientData.getVendorList()) {
            String vendorName = vendor.getName();
            IngredientData ingredientData = getIngredientFromVendor(vendorName, ingredientName);
            vendorIngredientMap.putVendorIngredientMap(vendorName, ingredientData);
        }

        responseObserver.onNext(vendorIngredientMap.build());
        responseObserver.onCompleted();
    }

    private IngredientData getIngredientFromVendor(String vendorName, String ingredientName)
    {
        JSONObject vendorItemsJson = (JSONObject) vendorToItemsJson.get(vendorName);
        JSONObject itemJson = (JSONObject) vendorItemsJson.get(ingredientName);

        Long quantity = (Long) itemJson.get(QUANTITY);
        Long price = (Long) itemJson.get(PRICE);

        IngredientData.Builder ingredientMap = IngredientData.newBuilder();
        ingredientMap.putData(QUANTITY, quantity);
        ingredientMap.putData(PRICE, price);

        return ingredientMap.build();
    }
}