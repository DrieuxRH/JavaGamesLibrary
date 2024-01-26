package fr.leCampusNumerique.cda25.javaAlgo.squareGames.board;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Coordonnees;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.Cell;

import java.util.HashMap;
import java.util.List;

public interface BoardInterface {
    void initializeBoard(int x, int y, String type);

    HashMap<Coordonnees, Cell> getFreeCells(Coordonnees coordonnees);
    boolean isPlayerInCase(Coordonnees coordonnees, Player player);

    Player getCurrentPlayerInCase(Coordonnees coordonnees);
}
