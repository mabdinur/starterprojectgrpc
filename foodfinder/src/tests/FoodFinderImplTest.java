package tests;

import org.junit.Test;

import service.FoodFinderService;

public class FoodFinderImplTest
{
    private static final String INGREDIENT_NAME = "item1";
    private static final Long PRICE = 10L;
    private static final Long QUANTITY = 1L;

    private static FoodFinderService foodFinderImpl = new FoodFinderService();

    @Test
    public void testGetVendorsByIngredient()
    {
        // Map<String, Long> ingredientInfoMap = foodFinderImpl.getIngredient(INGREDIENT_NAME);
        // assertEquals(ingredientInfoMap.get(FoodVendorService.PRICE), PRICE);
        // assertEquals(ingredientInfoMap.get(FoodVendorService.QUANTITY), QUANTITY);
    }
}
