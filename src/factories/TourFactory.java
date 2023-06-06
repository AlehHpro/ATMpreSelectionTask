package factories;

import enums.TourType;
import tours.Tour;

import java.util.Collection;

public abstract class TourFactory {
    public abstract Collection<Tour> generateRandomTours();
    public static TourFactory generateFactory(TourType type){
        switch (type){
            case CRUISE:
                //call CruiseFactory
                return new CruiseFactory();
            //case :
            default:
                throw new IllegalArgumentException();
        }
    }
}
