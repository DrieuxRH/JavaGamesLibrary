package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

import java.util.Objects;

public class Coordonnees implements CoordonneesInterface{

    private final int x;
    private final int y;
    public Coordonnees(int x, int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void setCoordonnes(int x, int y) {
        if(x < 0) x = 0;
        if(y < 0) y = 0;
    }

    @Override
    public Coordonnees convertCoordonnerMathUser(Coordonnees coordonnees) {
        return null;
    }

    @Override
    public Coordonnees convertCoordonnerUserUser(Coordonnees coordonnees) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coordonnees that)) return false;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
