package interfaces;

import tours.Tour;

import java.util.Comparator;

public interface CompareTransportType {
    Comparator<Tour> transportTypeComparator();
}
