package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.Connect4Symbol;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.Symbol;

public class Connect4Cell extends Cell {

    protected Connect4Cell() {
        super(Connect4Symbol.DEFAULT);
    }

    @Override
    public String getRepresentation() {
        return "| "+getSymbol().getSymbolRepresentation()+ " ";
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != Connect4Symbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol) {
        setSymbol(symbol);
    }
}
