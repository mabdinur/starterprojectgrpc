package service;

import org.json.simple.JSONObject;

import helpers.JSONReaderHelper;
import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.IngredientMap;
import javagrpc.Foodvendor.VendorIngredientData;
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

    public void getIngredientFromVendor(VendorIngredientData vendorIngredientData,
        StreamObserver<IngredientMap> responseObserver)
    {
        String vendorName = vendorIngredientData.getVendor().getName();
        String ingredientName = vendorIngredientData.getIngredient().getName();

        JSONObject vendorItemsJson = (JSONObject) vendorToItemsJson.get(vendorName);
        JSONObject itemJson = (JSONObject) vendorItemsJson.get(ingredientName);
        
        Long quantity = (Long) itemJson.get(QUANTITY);
        Long price = (Long) itemJson.get(PRICE);

        IngredientMap.Builder ingredientMap = IngredientMap.newBuilder();
        ingredientMap.putData(QUANTITY, quantity);
        ingredientMap.putData(PRICE, price);

        responseObserver.onNext(ingredientMap.build());
        responseObserver.onCompleted();
    }
}