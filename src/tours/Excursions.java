package tours;

import enums.MealType;
import enums.TourType;
import enums.TransportType;

public class Excursions extends Tour{
    private static final TourType TOUR_TYPE = TourType.EXCURSION;
    private static final int MIN_NUM_OF_DAYS = 1;
    private static final int MAX_NUM_OF_DAYS = 3;
    private MealType mealType;
    private TransportType transportType;


    public Excursions(){
        super.setDuration((int) ((Math.random() * (MAX_NUM_OF_DAYS - MIN_NUM_OF_DAYS)) + MIN_NUM_OF_DAYS));
    }

    @Override
    public String toString() {
        return getTourType() + " " + getDuration() + " " + getTransportType() + " " + getCost() + " " + getMealType();
    }

    @Override
    public TourType getTourType() {
        return TOUR_TYPE;
    }

    @Override
    public TransportType getTransportType() {
        return transportType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }
}
