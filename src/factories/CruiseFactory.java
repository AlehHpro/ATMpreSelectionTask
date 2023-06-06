package factories;

import tours.Cruise;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CruiseFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> cruiseList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Cruise cruise = new Cruise();
            cruiseList.add(cruise);
        }
        return cruiseList;
    }

}
