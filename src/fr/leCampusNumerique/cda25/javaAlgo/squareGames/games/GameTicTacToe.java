package fr.leCampusNumerique.cda25.javaAlgo.squareGames.games;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.View;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.board.Board;

public class GameTicTacToe implements GameInterface{

    Board ticTacToeBoard = new Board(4, 4, "ticTacToe");


    public void play(){
        View.getInstance().displayBoardWithHorizontalLines(ticTacToeBoard);
    }
}
