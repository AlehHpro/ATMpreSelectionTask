package tours;

import interfaces.CompareCost;
import interfaces.CompareDuration;
import interfaces.CompareTourType;
import interfaces.CompareTransportType;
import enums.TourType;
import enums.TransportType;

import java.util.Comparator;

public abstract class Tour implements CompareCost, CompareTourType, CompareDuration, CompareTransportType {
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

    @Override
    public Comparator<Tour> costComparator() {
        //anonymous class which implements comparator with a Tour type and creates an obj. of this class
        return new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                if (o1.getCost() == o2.getCost()) {
                    return 0;
                } else if (o1.getCost() > o2.getCost()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
    }

    @Override
    public Comparator<Tour> tourTypeComparator() {
        return new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getTourType().name().compareTo(o2.getTourType().name());
            }
        };
    }

    @Override
    public Comparator<Tour> durationComparator() {
        return new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                if (o1.getDuration() == o2.getDuration()) {
                    return 0;
                } else if (o1.getDuration() > o2.getDuration()) {
                    return 1;
                } else {
                    return -1;
                }

            }
        };
    }

    @Override
    public Comparator<Tour> transportTypeComparator() {
        return new Comparator<Tour>() {
            @Override
            public int compare(Tour o1, Tour o2) {
                return o1.getTransportType().name().compareTo(o2.getTransportType().name());
            }
        };
    }
}
