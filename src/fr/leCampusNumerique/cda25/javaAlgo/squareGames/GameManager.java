package fr.leCampusNumerique.cda25.javaAlgo.squareGames;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.PlayerAI;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.PlayerHuman;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.UserInteraction;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Validator;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameFactory;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameInterface;

import java.util.Objects;

public class GameManager {
    public void runGame() {

        //TODO Too long, to refactor
        View view = View.getInstance();
        UserInteraction userInteraction = UserInteraction.getInstance();
        Validator validator = new Validator();
        GameFactory gameFactory = new GameFactory();

        view.showOneLineMsg("****Welcome to Play****");

        String gameChoice = getGameChoise(validator);
        String modeChoise = getModeChoice(validator);


        GameInterface game = gameFactory.createGame(gameChoice);
        createPlayers(modeChoise);
        game.play();
        //initializeGame(gameChoice, modeChoide);

        
    }

    private String getGameChoise(Validator validator){
        String gameChoice = "";
        while(!validator.isValidChoiceString0neToTrhee(gameChoice)){
            View.getInstance().showGameList();
            gameChoice = UserInteraction.getInstance().getUserInput();
        }
        return gameChoice;
    }

    private String getModeChoice(Validator validator){
        String modeChoice = "";
        while(!validator.isValidChoiceString0neToTrhee(modeChoice)){
            View.getInstance().showModeList();
            modeChoice = UserInteraction.getInstance().getUserInput();
        }
        return modeChoice;
    }

    private Player[] createPlayers(String moodeChoise){
        switch (moodeChoise){
            case "1":
                View.getInstance().showOneLineMsg("You have chosen two human players");
                initializePlayer1( "human");
                initializePlayer2("human");
                break;
            case "2":
                View.getInstance().showOneLineMsg("You have chose human player agains computer");
                initializePlayer1("human");
                initializePlayer2("ai");
                break;
            case "3":
                View.getInstance().showOneLineMsg("You have chosen computer to play against itself");
                initializePlayer1("ai");
                initializePlayer2("ai");
                break;
        }
    }

    private void initializePlayer1(String type) {
        if(Objects.equals(type, "human")) {
            String playerName = UserInteraction.getInstance().getPlayerName(1);
            Player player1 = new PlayerHuman(playerName, "| O ");
            player1.setTurn(true);
        }
        if(Objects.equals(type, "ai")) {
            Player player1 = new PlayerAI("player 1 AI ", "| O ");
            player1.setTurn(true);
        }
    }

    private void initializePlayer2(String type) {
        if(type.equals("human")) {
            String playerName = UserInteraction.getInstance().getPlayerName(2);
            Player player2 = new PlayerHuman(playerName, "| X ");
        }
        if(type.equals("ai")) {
            Player player2 = new PlayerAI("Player 1 AI ", "| X ");
        }
    }


}
