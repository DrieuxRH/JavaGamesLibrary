package fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols;

public enum Connect4Symbol implements Symbol {

    DEFAULT(" "),
    R("R"),
    J("J"),
    ;

    private String representation;

    @Override
    public String getSymbolRepresentation() {
        return representation;
    }

    Connect4Symbol(String representation) {
        this.representation = representation;
    }


}
