import enums.TourType;
import tours.Tour;
import factories.TourFactory;
import io.InteractionWithUser;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        InteractionWithUser interact = new InteractionWithUser();
        String input = interact.start();
        TourType type = null;

        //attempt to assign tourType returned from start() method to local 'type' variable
        try{
            type = TourType.valueOf(input);
        } catch (IllegalArgumentException e){
            throw e;
        }

        //call to the general TourFactory class where generateFactory method returns factory object of
        //the specific type depending on user input
        TourFactory factory = TourFactory.generateFactory(type);

        //return the collection of specific tours
        Collection<Tour> tours = factory.generateRandomTours();

        for(Tour c : tours){
            System.out.println(c.toString());
        }

    }
}