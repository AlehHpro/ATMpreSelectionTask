package tours;

import enums.Meal;
import enums.TourType;
import enums.TransportType;

public abstract class Tour {
    //transportation, meals, number of days
    private TourType tourType;
    private int minNumOfDays;
    private int maxNumOfDays;
    private Meal mealType;
    private TransportType transportType;
    private int cost;

    @Override
    public String toString() {
        return "Tour{" +
                "tourType=" + tourType +
                ", minNumOfDays=" + minNumOfDays +
                ", maxNumOfDays=" + maxNumOfDays +
                ", mealType=" + mealType +
                ", transportType=" + transportType +
                ", cost=" + cost +
                '}';
    }
}
