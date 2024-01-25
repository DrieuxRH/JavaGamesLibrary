package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.Symbol;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.TicTacToeSymbol;

public class TicTacToeCell extends Cell{
    @Override
    public String getRepresentation() {
        return "| "+getSymbol().getSymbolRepresentation()+ " ";
    }

    @Override
    public boolean isOccupied() {
        return getSymbol() != TicTacToeSymbol.DEFAULT;
    }

    @Override
    public void occupy(Symbol symbol)  {
        setSymbol(symbol);
    }

    public TicTacToeCell() {
        super(TicTacToeSymbol.DEFAULT);
    }
}
