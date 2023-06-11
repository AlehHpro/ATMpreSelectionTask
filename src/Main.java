import customexceptions.CommandNotFoundException;
import customexceptions.TourNotFoundException;
import enums.CommandType;
import enums.TourType;
import searchtours.SearchEngine;
import tours.Tour;
import factories.TourFactory;
import io.InteractionWithUser;

import java.util.*;

public class Main {
    public static Map<TourType, Collection<Tour>> tourMap = new HashMap<>();

    public static void main(String[] args) {

        while (true) {

            InteractionWithUser interact = new InteractionWithUser();
            String input = interact.start();
            validateCommand(input);
            if (input.equals(CommandType.EXIT.name())) {
                return;
            } else if (input.equals(CommandType.GENERATE_TOURS.name())) {
                input = interact.generateTourCommand();
                TourType type = null;
                // Attempt to assign tourType returned from start() method to local 'type' variable.
                try {
                    type = TourType.valueOf(input);
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid tour type!");
                    continue;
                }
                // Call to the general TourFactory class where generateFactory method returns factory object of
                // the specific type depending on user input.
                TourFactory factory = TourFactory.generateFactory(type);

                // Return the collection of specific tours.
                Collection<Tour> tours = factory.generateRandomTours();

                tourMap.put(type, tours);

                for (Tour c : tours) {
                    System.out.println(c.toString());
                }
            } else if (input.equals(CommandType.SORT_BY_COST.name())) {
                List<Tour> allTours = getTourList();
                try {
                    Collections.sort(allTours, allTours.get(0).costComparator());
                    for (Tour v : allTours) {
                        System.out.println(v);
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Generate tours first!");
                    continue;
                }

            } else if (input.equals(CommandType.SORT_BY_TOUR_TYPE.name())) {
                List<Tour> allTours = getTourList();
                Collections.sort(allTours, allTours.get(0).tourTypeComparator());
                for (Tour v : allTours) {
                    System.out.println(v);
                }
            } else if (input.equals(CommandType.SORT_BY_DURATION.name())) {
                List<Tour> allTours = getTourList();
                Collections.sort(allTours, allTours.get(0).durationComparator());
                for (Tour v : allTours) {
                    System.out.println(v);
                }
            } else if (input.equals(CommandType.SORT_BY_TRANSPORT.name())) {
                List<Tour> allTours = getTourList();
                Collections.sort(allTours, allTours.get(0).transportTypeComparator());
                for (Tour v : allTours) {
                    System.out.println(v);
                }
            } else if (input.equals(CommandType.SEARCH.name())) {
                List<Tour> allTours = getTourList();
                SearchEngine engine = new SearchEngine(allTours);

                System.out.println("Enter tour type");

                String userInput = interact.readInput();
                validateTourTypeExists(tourMap, userInput);

                engine.filterByType(userInput);
                engine.printContent();

                System.out.println("Enter min. tour duration.");
                int minDuration = interact.readIntInput();
                System.out.println("Enter max. tour duration.");
                int maxDuration = interact.readIntInput();
                validateMinMaxDuration(minDuration, maxDuration);

                engine.filterByDuration(minDuration, maxDuration);
                engine.printContent();

            }

        }


    }

    private static void validateMinMaxDuration(int minDuration, int maxDuration) {
        if (minDuration <= 0 || maxDuration <= 0) {
            throw new IllegalArgumentException("Values should be > 0 !");
        }
        if (maxDuration < minDuration) {
            throw new IllegalArgumentException("max. tour duration should be > min. tour duration!");
        }
    }

    private static List<Tour> getTourList() {
        List<Tour> allTours = new ArrayList<>();
        for (Collection<Tour> v : tourMap.values()) {
            allTours.addAll(v);
        }
        return allTours;
    }

    private static void validateCommand(String input) throws CommandNotFoundException {
        for (CommandType c : CommandType.values()) {
            if (c.name().equals(input)) {
                return;
            }
        }
        throw new CommandNotFoundException("Command does not exist!");
    }

    private static void validateTourTypeExists(Map<TourType, Collection<Tour>> map, String input) throws TourNotFoundException {
        for (TourType t : map.keySet()) {
            if (t.name().equals(input)) {
                return;
            }
        }
        throw new TourNotFoundException("No such tours in DB!");
    }
}