package factories;

import tours.Shopping;
import tours.Tour;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ShoppingFactory extends TourFactory{
    @Override
    public Collection<Tour> generateRandomTours() {
        List<Tour> shoppingList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Shopping shopping = new Shopping();
            shoppingList.add(shopping);
        }
        return shoppingList;
    }
}
