package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player;

public abstract class Player {
    private String representation;
    private Boolean turn = false;
    private String name;

    Player(String name,String representation){
        this.turn = false;
        this.name = name;
        this.representation = representation;
    }


    public String getName(){
        return this.name;
    }

    public String getRepresentation() {
        return representation;
    }

    public void setRepresentation(String representation){
        this.representation = representation;
    }

    public void setTurn(Boolean turn){
        this.turn = turn;
    }

    public boolean getTurn(){
        return this.turn;
    }
}
