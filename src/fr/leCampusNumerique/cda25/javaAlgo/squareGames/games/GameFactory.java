package fr.leCampusNumerique.cda25.javaAlgo.squareGames.games;

public class GameFactory {
    public GameInterface createGame(String name){
        return switch (name) {
            case "ticTacToe" -> new GameTicTacToe();
            case "connect4" -> new GameConnect4();
            case "gomoku" -> new GameGomoku();
            default -> throw new IllegalArgumentException("The game name is not correct.");
        };
    }
}
