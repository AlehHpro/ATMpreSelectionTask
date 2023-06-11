package searchtours;

import tours.Tour;

import java.util.ArrayList;
import java.util.List;

public class SearchEngine {
    private List<Tour> searchResults;

    public SearchEngine(List<Tour> list) {
        if (list == null){
            throw new NullPointerException("Can not initialise SearchEngine with NULL collection!!!");
        }
        this.searchResults = list;
    }

    public void printContent() {
        for (Tour v : searchResults) {
            System.out.println(v);
        }
    }

    public void filterByType(String s) {
        List<Tour> filteredTours = new ArrayList<>();
        for (Tour t : searchResults) {
            if (t.getTourType().name().equals(s)) {
                filteredTours.add(t);
            }
        }
        searchResults = filteredTours;
    }

    public void filterByDuration(int min, int max) {
        List<Tour> filteredTours = new ArrayList<>();
        for (Tour t : searchResults) {
            if (t.getDuration() >= min && t.getDuration() <= max) {
                filteredTours.add(t);
            }
        }
        searchResults = filteredTours;
    }

}
