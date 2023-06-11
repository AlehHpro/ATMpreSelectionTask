package factories;

import enums.MealType;
import enums.TransportType;
import tours.Tour;
import tours.Travelling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public class TravelFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> travelList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Travelling travel = new Travelling();

            travel.setCost(generatePrice());
            travel.setMealType(MealType.randomValue());
            travel.setTransportType(TransportType.randomValue());

            travelList.add(travel);
        }
        return travelList;
    }

}
