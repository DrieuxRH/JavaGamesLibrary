package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.Cell;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.TicTacToeCell;

public class CellFactory {
    public Cell createCell(String name){
        return switch (name) {
            case "ticTacToe" -> new TicTacToeCell();
            case "connect4" -> new Connect4Cell();
            case "gomoku" -> new GomokuCell();
            default -> throw new IllegalArgumentException("The cell name is not correct.");
        };
    }
}
