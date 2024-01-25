package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.Symbol;

public abstract class Cell {

    private Symbol symbol;

    protected Symbol getSymbol() {
        return symbol;
    }

    protected void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract String getRepresentation();

    public abstract boolean isOccupied();

    protected Cell(Symbol symbol) {
        this.symbol = symbol;
    }

    public abstract void occupy(Symbol symbol);
}
