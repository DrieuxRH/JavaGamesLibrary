package fr.leCampusNumerique.cda25.javaAlgo.squareGames;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.UserInteraction;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Validator;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameFactory;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.games.GameInterface;

import java.util.Objects;

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
        createPlayers(modeChoice);
        game.play();
        //initializeGame(gameChoice, modeChoide);

        
    }

    private Player[] createPlayers(String moodeChoise){
        switch (moodeChoise){
            case "a":
                View.getInstance().showOneLineMsg("You have chosen two human players");
                initializePlayer1( "human");
                initializePlayer2("human");
                break;
            case "b":
                View.getInstance().showOneLineMsg("You have chose human player agains computer");
                initializePlayer1("human");
                initializePlayer2("ai");
                break;
            case "c":
                View.getInstance().showOneLineMsg("You have chosen computer to play against itself");
                initializePlayer1("ai");
                initializePlayer2("ai");
                break;
        }
    }

    private void initializePlayer1(String type) {
        if(Objects.equals(type, "human")) {
            String playerName = UserInteraction.getInstance().getPlayerName(1);
            this.player1 = new PlayerHuman(playerName);
            player1.setRepresentation("| O ");
            player1.setTurn(true);
        }
        if(Objects.equals(type, "ai")) {
            this.player1 = new PlayerAI("player 1 AI ");
            player1.setRepresentation("| O ");
            player1.setTurn(true);
        }
    }

    private void initializePlayer2(String type) {
        if(type.equals("human")) {
            String playerName = interactionUtilisateur.getPlayerName(2);
            this.player2 = new PlayerHuman(playerName);
            player2.setRepresentation("| X ");
            player2.setTurn(false);
        }
        if(type.equals("ai")) {
            this.player2 = new PlayerAI("Player 1 AI ");
            player2.setRepresentation("| X ");
            player2.setTurn(false);
        }
    }


}
