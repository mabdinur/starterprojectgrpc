package test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import io.grpc.stub.StreamObserver;
import javagrpc.Foodvendor.VendorIngredientData;
import javagrpc.Ingredients.Ingredient;
import javagrpc.Ingredients.VendorIngredientMap;
import javagrpc.VendorsOuterClass.Vendor;
import javagrpc.VendorsOuterClass.Vendors;
import javagrpc.foodSupplierGrpc.foodSupplierBlockingStub;
import javagrpc.foodVendorGrpc.foodVendorBlockingStub;
import service.FoodFinderService;

@RunWith(MockitoJUnitRunner.class)
public class FoodFinderServiceTest
{
    @InjectMocks
    private FoodFinderService foodFinderService;
    @Mock
    foodSupplierBlockingStub foodSupplierStub;
    @Mock
    foodVendorBlockingStub foodVendorStub;
    @Mock
    private Ingredient ingredient;
    @Mock
    private VendorIngredientMap vendorIngredientMap;
    @Mock
    private VendorIngredientData vendorIngredientData;
    @Mock
    private Vendors vendors;
    @Mock
    private Vendor vendor;
    @Mock
    private StreamObserver<VendorIngredientMap> responseObserver;

    @Test
    public void testGetVendorsByIngredient() throws Exception
    {
        when(foodSupplierStub.getVendorsByIngredient(ingredient)).thenReturn(vendors);
        when(foodVendorStub.getIngredientFromVendors(any(VendorIngredientData.class))).thenReturn(vendorIngredientMap);
        foodFinderService.getIngredient(ingredient, responseObserver);

        verify(foodSupplierStub).getVendorsByIngredient(ingredient);
        verify(foodVendorStub).getIngredientFromVendors(any(VendorIngredientData.class));
        verify(responseObserver).onNext(vendorIngredientMap);
        verify(responseObserver).onCompleted();
    }
}
