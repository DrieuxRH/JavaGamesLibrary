package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols;

public enum GomokuSymbol implements Symbol {

    DEFAULT(" "),
    N("N"),
    B("B"),
    ;

    private String representation;

    @Override
    public String getSymbolRepresentation() {
        return representation;
    }

    GomokuSymbol(String representation) {
        this.representation = representation;
    }


}
