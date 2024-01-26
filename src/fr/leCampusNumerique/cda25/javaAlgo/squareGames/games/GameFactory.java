package fr.leCampusNumerique.cda25.javaAlgo.squareGames.games;

public class GameFactory {
    public GameInterface createGame(String name){
        return switch (name) {
            case "1" -> new GameTicTacToe();
            case "2" -> new GameConnect4();
            case "3" -> new GameGomoku();
            default -> throw new IllegalArgumentException("The game name is not correct.");
        };
    }
}
