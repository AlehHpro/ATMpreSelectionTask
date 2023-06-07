package factories;

import tours.Tour;
import tours.Travelling;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TravelFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> travelList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Travelling travel = new Travelling();
            travelList.add(travel);
        }
        return travelList;
    }
}
