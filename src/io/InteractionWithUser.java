package io;

import customexceptions.InvalidParameterException;
import enums.CommandType;
import enums.TourType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractionWithUser {
    //TBI: generate all tours
    public String start() {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Select an option: ");
        for (CommandType c : CommandType.values()) {
            System.out.println(c);
        }
        String command = myObj.nextLine();  // Read user input
        return command;
    }

    public String generateTourCommand(){
        System.out.println("Which tours should be generated?");
        for (TourType c : TourType.values()) {
            System.out.println(c);
        }

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        String tourType = myObj.nextLine();  // Read user input

        return tourType;
    }

    public String readInput(){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        return myObj.nextLine();  // Read user input

    }

    public int readIntInput() throws InvalidParameterException {
        try {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            return myObj.nextInt();  // Read user input
        } catch (InputMismatchException e){
            throw new InvalidParameterException(e);
        }

    }

    //implement validation for user input
    public void validateType(String tourType){}

}
