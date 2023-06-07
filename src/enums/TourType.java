package enums;

import java.util.Random;

public enum TourType {
    CRUISE, EXCURSION, SHOPPING, TRAVEL;

    private static final Random RANDOM = new Random();

    public static TourType randomValue()  {
        TourType[] values = values();
        return values[RANDOM.nextInt(values.length)];
    }

}
