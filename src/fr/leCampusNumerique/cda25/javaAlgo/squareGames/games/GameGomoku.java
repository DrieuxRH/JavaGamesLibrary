package fr.leCampusNumerique.cda25.javaAlgo.squareGames.games;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.board.Board;

public class GameGomoku implements GameInterface{
    Board Connect4Board = new Board(15, 15, "gomoku");
    @Override
    public void play() {
        View.getInstance().displayBoardWithHorizontalLines(Connect4Board);
    }
}
