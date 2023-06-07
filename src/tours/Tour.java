package tours;

import enums.MealType;
import enums.TourType;
import enums.TransportType;

public abstract class Tour {
    //transportation, meals, number of days
    private int duration;
    private long cost;

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public abstract TourType getTourType();

    public abstract TransportType getTransportType();
}
