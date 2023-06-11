package enums;

import java.util.Random;

public enum MealType {
    RO, BB, HB, FB, AI, UAI, NOT_INCLUDED;

    private static final Random RANDOM = new Random();

    public static MealType randomValue()  {
        MealType[] values = values();
        return values[RANDOM.nextInt(values.length)];
    }

}
