package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

public class Coordonnees implements CoordonneesInterface{


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
}
