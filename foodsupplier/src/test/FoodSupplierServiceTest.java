package test;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.google.common.collect.Sets;

import io.grpc.stub.StreamObserver;
import javagrpc.Foodsupplier.Ingredient;
import javagrpc.Foodsupplier.Vendors;
import service.FoodSupplierService;;

@RunWith(MockitoJUnitRunner.class)
public class FoodSupplierServiceTest
{
    private static final String VENDOR = "shop1";
    private static final String INGREDIENT_NAME = "item1";

    @InjectMocks
    private FoodSupplierService foodSupplierService;
    @Mock
    private JSONObject jsonObject;
    @Mock
    private JSONArray jsonArray;

    @Mock
    private Ingredient ingredient;
    @Mock
    private StreamObserver<Vendors> responseObserver;

    @Test
    public void testGetVendorsByIngredient()
    {
        when(jsonObject.keySet()).thenReturn(Sets.newHashSet(VENDOR));

        when(jsonObject.get(VENDOR)).thenReturn(jsonArray);
        when(ingredient.getName()).thenReturn(INGREDIENT_NAME);
        when(jsonArray.contains(INGREDIENT_NAME)).thenReturn(true);

        foodSupplierService.getVendorsByIngredient(ingredient, responseObserver);

        verify(responseObserver).onNext(any(Vendors.class));
        verify(responseObserver).onCompleted();
    }
}
