package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

import java.util.Scanner;

public class UserInteraction {
    // This class will be a singleton
    private static UserInteraction instance;

    private UserInteraction(){};

    public static UserInteraction getInstance(){
        if (instance == null){
            instance = new UserInteraction();
        }
        return instance;
    }

    public String getUserInput(){
        // Enter data using Scanner
        Scanner scn = new Scanner(System.in);

        // Returning the read data using readLine
        return scn.nextLine();
    }
}
