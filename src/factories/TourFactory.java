package factories;

import enums.TourType;
import tours.Tour;

import java.util.Collection;

public abstract class TourFactory {
    public abstract Collection<Tour> generateRandomTours();
    //returns specific factory depending on user input in Main
    public static TourFactory generateFactory(TourType type){
        switch (type){
            case CRUISE:
                return new CruiseFactory();
            case EXCURSION:
                return new ExcursionFactory();
            case SHOPPING:
                return new ShoppingFactory();
            case TRAVEL:
                return new TravelFactory();
            default:
                throw new IllegalArgumentException();
        }
    }

    protected long generatePrice(){
        long leftLimit = 1L;
        long rightLimit = 5000L;
        long cost = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));

        return cost;
    }
}
