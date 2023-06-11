package interfaces;

import tours.Tour;

import java.util.Comparator;

public interface CompareCost {
    Comparator<Tour> costComparator();
}
