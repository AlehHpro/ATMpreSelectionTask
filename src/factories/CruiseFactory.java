package factories;

import enums.MealType;
import tours.Cruise;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class CruiseFactory extends TourFactory {
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> cruiseList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Cruise cruise = new Cruise();

            cruise.setCost(generatePrice());
            cruise.setMealType(randomMeal());

            cruiseList.add(cruise);
        }
        return cruiseList;
    }

    private static MealType randomMeal()  {
        Random random = new Random();
        MealType[] values = {MealType.AI, MealType.UAI};
        return values[random.nextInt(values.length)];
    }

}
