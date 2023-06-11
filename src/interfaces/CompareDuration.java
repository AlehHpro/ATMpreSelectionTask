package interfaces;

import tours.Tour;

import java.util.Comparator;

public interface CompareDuration {
    Comparator<Tour> durationComparator();
}
