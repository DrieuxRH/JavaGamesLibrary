package fr.leCampusNumerique.cda25.javaAlgo.squareGames.board;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Coordonnees;

import java.util.List;

public interface BoardInterface {
    void initalizeBoard(int size);

    List<Coordonnees> getFreeCells(Coordonnees coordonnees);
    boolean isPlayerInCase(Coordonnees coordonnees, Player player);

    Player getCurrentPlayerInCase(Coordonnees coordonnees);
}
