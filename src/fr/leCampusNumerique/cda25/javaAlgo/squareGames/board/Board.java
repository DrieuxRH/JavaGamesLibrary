package fr.leCampusNumerique.cda25.javaAlgo.squareGames.board;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Coordonnees;

import java.util.List;

public class Board implements BoardInterface {


    @Override
    public void initalizeBoard(int size) {

    }

    @Override
    public List<Coordonnees> getFreeCells(Coordonnees coordonnees) {
        return null;
    }

    @Override
    public boolean isPlayerInCase(Coordonnees coordonnees, Player player) {
        return false;
    }

    @Override
    public Player getCurrentPlayerInCase(Coordonnees coordonnees) {
        return null;
    }


}
