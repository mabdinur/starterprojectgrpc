package tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import io.grpc.stub.StreamObserver;
import javagrpc.Foodsupplier.Ingredient;
import javagrpc.Foodsupplier.Vendors;
import javagrpc.Foodsupplier.Vendors.Builder;
import javagrpc.Foodsupplier.Vendors.Vendor;
import service.FoodSupplierService;;

public class FoodSupplierImplTest
{
    private FoodSupplierService foodFinderService;

    private Ingredient ingredient;

    private StreamObserver<Vendors> responseObserver;

    private static final String VENDOR = "shop1";

    private static final String INGREDIENT_NAME = "item1";

    @Before
    public void setup()
    {
        foodFinderService = new FoodSupplierService();

        ingredient = mock(Ingredient.class);
        responseObserver = mock(StreamObserver.class);
    }

    @Test
    public void testGetVendorsByIngredient()
    {
        when(ingredient.getName()).thenReturn(INGREDIENT_NAME);
        // doNothing().when(responseObserver.onNext(any(Vendors.class))).thenReturn();

        foodFinderService.getVendorsByIngredient(ingredient, responseObserver);

        Builder vendors = mock(Builder.class);
        Vendor vendor = mock(Vendor.class);
        verify(vendors, times(1)).addVendor(vendor);

        // vendors.addVendor(vendor);
        // assertTrue(storesWithIngredient.stream().anyMatch(shop -> VENDOR.equals(shop)));
    }

}
