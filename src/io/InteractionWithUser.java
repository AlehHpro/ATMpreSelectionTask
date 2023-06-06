package io;

import enums.TourType;

import java.util.Scanner;

public class InteractionWithUser {
    public String start() {
        System.out.println("Which tours should be generated?");

        for (TourType c : TourType.values()) {
            System.out.println(c);
        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String tourType = myObj.nextLine();  // Read user input

        return tourType;
    }

    public void validateType(String tourType){}

}
