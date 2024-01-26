package fr.leCampusNumerique.cda25.javaAlgo.squareGames;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.UserInteraction;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Validator;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameFactory;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameInterface;

public class GameManager {
    public static void main(String[] args) {

        //TODO Too long, to refactor

        View view = View.getInstance();
        UserInteraction userInteraction = UserInteraction.getInstance();
        Validator validator = new Validator();
        GameFactory gameFactory = new GameFactory();

        view.showOneLineMsg("****Welcome to Play****");

        String gameChoice = "";

        while(!validator.isValidChoiceString0neToTrhee(gameChoice)){
            view.showGameList();
            gameChoice = userInteraction.getUserInput();
        }

        String modeChoice = "";

        while(!validator.isValidChoiceString0neToTrhee(modeChoice)){
            view.showModeList();
            modeChoice = userInteraction.getUserInput();
        }


        GameInterface game = gameFactory.createGame(gameChoice);
        game.play();
        //initializeGame(gameChoice, modeChoide);

        
    }


}
