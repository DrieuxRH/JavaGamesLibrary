package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

public class Validator {

    public Validator(){};

    public boolean isValidChoiceString0neToTrhee(String gameChoice){
        return gameChoice.matches("[1-3]");
    }
}
