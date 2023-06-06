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

        try{
            type = TourType.valueOf(input);
        } catch (IllegalArgumentException e){
            throw e;
        }

        TourFactory factory = TourFactory.generateFactory(type);
        //return collection of specific tours
        Collection<Tour> tours = factory.generateRandomTours();

        for(Tour c : tours){
            System.out.println(c.toString());
        }

    }
}