package enums;

import java.util.Random;

public enum TransportType {
    CAR, BUS, PLANE, SHIP, TRAIN;

    private static final Random RANDOM = new Random();

    public static TransportType randomValue()  {
        TransportType[] values = values();
        return values[RANDOM.nextInt(values.length)];
    }

}
