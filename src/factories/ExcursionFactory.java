package factories;

import enums.MealType;
import enums.TransportType;
import tours.Excursions;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class ExcursionFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> excursionList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Excursions excursion = new Excursions();

            excursion.setCost(generatePrice());
            if(excursion.getDuration() > 1){
                excursion.setMealType(randomMeal());
            } else {
                excursion.setMealType(MealType.NOT_INCLUDED);
            }
            excursion.setTransportType(randomTransport());

            excursionList.add(excursion);
        }
        return excursionList;
    }

    private static MealType randomMeal(){
        Random random = new Random();
        MealType[] values = {MealType.RO, MealType.BB};
        return values[random.nextInt(values.length)];
    }

    private static TransportType randomTransport(){
        Random random = new Random();
        TransportType[] values = {TransportType.BUS, TransportType.CAR};
        return values[random.nextInt(values.length)];
    }

}
