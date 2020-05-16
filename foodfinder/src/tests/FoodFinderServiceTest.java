package tests;

import static org.mockito.Mockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.legacy.PowerMockRunner;

import io.grpc.stub.StreamObserver;
import javagrpc.Ingredients.Ingredient;
import javagrpc.Ingredients.IngredientMap;
import service.FoodFinderService;

//@RunWith(MockitoJUnitRunner.class)
@RunWith(PowerMockRunner.class)
public class FoodFinderServiceTest
{
    private static final String INGREDIENT_NAME = "item1";
    private static final Long PRICE = 10L;
    private static final Long QUANTITY = 1L;

    private FoodFinderService foodFinderService = new FoodFinderService();
    private Ingredient ingredient;

    private StreamObserver<IngredientMap> responseObserver;
    
    @Before
    public void setup() {
        ingredient = mock(Ingredient.class);
        responseObserver = mock(StreamObserver.class);
    }

    @Test
    public void testGetVendorsByIngredient()
    {
        when(ingredient.getName()).thenReturn(INGREDIENT_NAME);
        // whenNew(foodSupplierBlockingStub.class).withAnyArguments().thenReturn(myclassSpy);

        foodFinderService.getIngredient(ingredient, responseObserver);
        // Map<String, Long> ingredientInfoMap = foodFinderImpl.getIngredient(INGREDIENT_NAME);
        // assertEquals(ingredientInfoMap.get(FoodVendorService.PRICE), PRICE);
        // assertEquals(ingredientInfoMap.get(FoodVendorService.QUANTITY), QUANTITY);
    }
}
