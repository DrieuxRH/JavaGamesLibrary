package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.GomokuSymbol;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.Symbol;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.TicTacToeSymbol;

public class GomokuCell extends Cell{
    @Override
    public String getRepresentation() {
        return "| "+getSymbol().getSymbolRepresentation()+ " ";
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != GomokuSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol)  {
        setSymbol(symbol);
    }

    public GomokuCell() {
        super(GomokuSymbol.DEFAULT);
    }
}
