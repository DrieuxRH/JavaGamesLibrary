package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols;

import java.util.Arrays;
import java.util.List;

public enum TicTacToeSymbol implements Symbol {

    DEFAULT(" "),
    X("X"),
    Y("Y"),
    ;

    private String representation;

    @Override
    public String getSymbolRepresentation() {
        return representation;
    }

    TicTacToeSymbol(String representation) {
        this.representation = representation;
    }

}
