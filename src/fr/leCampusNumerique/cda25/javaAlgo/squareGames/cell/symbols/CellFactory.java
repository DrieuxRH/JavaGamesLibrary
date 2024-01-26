package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.Cell;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.TicTacToeCell;

public class CellFactory {
    public Cell createCell(String name){
        return switch (name) {
            case "ticTacToe" -> new TicTacToeCell();
            case "2" -> new TicTacToeCell();
            case "3" -> new TicTacToeCell();
            default -> throw new IllegalArgumentException("The cell name is not correct.");
        };
    }
}
