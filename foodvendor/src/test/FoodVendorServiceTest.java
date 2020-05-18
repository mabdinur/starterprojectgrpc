package test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.VendorIngredientData;
import javagrpc.Foodvendor.VendorIngredientData.Vendor;
import javagrpc.Foodvendor.VendorIngredientMap;
import service.FoodVendorService;

@RunWith(MockitoJUnitRunner.class)
public class FoodVendorServiceTest
{
    private static final String VENDOR_NAME = "shop1";
    private static final String INGREDIENT_NAME = "item1";

    private static final Long QUANTITY = 1L;
    private static final Long PRICE = 10L;

    @InjectMocks
    private FoodVendorService foodVendorService;
    @Mock
    private JSONObject jsonObject;

    @Mock(answer = Answers.RETURNS_DEEP_STUBS)
    private VendorIngredientData vendorIngredientData;

    @Mock
    Vendor vendor;

    @Mock
    private StreamObserver<VendorIngredientMap> responseObserver;

    @Test
    public void testGetVendorsByIngredient()
    {
        when(vendorIngredientData.getIngredient().getName()).thenReturn(INGREDIENT_NAME);
        when(vendorIngredientData.getVendorList()).thenReturn(Arrays.asList(vendor));
        when(vendor.getName()).thenReturn(VENDOR_NAME);

        when(jsonObject.get(VENDOR_NAME)).thenReturn(jsonObject);
        when(jsonObject.get(INGREDIENT_NAME)).thenReturn(jsonObject);
        when(jsonObject.get(FoodVendorService.QUANTITY)).thenReturn(QUANTITY);
        when(jsonObject.get(FoodVendorService.PRICE)).thenReturn(PRICE);

        foodVendorService.getIngredientFromVendors(vendorIngredientData, responseObserver);
        
        verify(responseObserver).onNext(any(VendorIngredientMap.class));
        verify(responseObserver).onCompleted();
    }
}
