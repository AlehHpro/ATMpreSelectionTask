package factories;

import enums.MealType;
import tours.Shopping;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ShoppingFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> shoppingList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Shopping shopping = new Shopping();

            shopping.setCost(generatePrice());
            if (shopping.getDuration() == 1){
                shopping.setMealType(MealType.NOT_INCLUDED);
            } else {
                shopping.setMealType(randomMeal());
            }
            

            shoppingList.add(shopping);
        }
        return shoppingList;
    }

    private static MealType randomMeal()  {
        Random random = new Random();
        MealType[] values = {MealType.NOT_INCLUDED, MealType.RO};
        return values[random.nextInt(values.length)];
    }
}
