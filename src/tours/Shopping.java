package tours;

import enums.MealType;
import enums.TourType;
import enums.TransportType;

public class Shopping extends Tour{
    private static final TourType TOUR_TYPE = TourType.SHOPPING;
    private static final int MIN_NUM_OF_DAYS = 1;
    private static final int MAX_NUM_OF_DAYS = 3;
    private MealType mealType;
    private static final TransportType TRANSPORT_TYPE = TransportType.BUS;

    public Shopping(){
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
        return TRANSPORT_TYPE;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }
}
