package fr.leCampusNumerique.cda25.javaAlgo.squareGames.games;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.board.Board;

public class GameConnect4 implements GameInterface{

    Board Connect4Board = new Board(7, 6, "connect4");
    @Override
    public void play() {
        View.getInstance().displayBoardWithoutHorizontalLines(Connect4Board);
    }
}
