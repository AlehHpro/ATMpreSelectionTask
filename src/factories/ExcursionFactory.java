package factories;

import tours.Excursions;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ExcursionFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> excursionList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Excursions excursion = new Excursions();
            excursionList.add(excursion);
        }
        return excursionList;
    }
}
