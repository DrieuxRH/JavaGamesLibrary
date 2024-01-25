package fr.leCampusNumerique.cda25.javaAlgo.squareGames;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Coordonnees;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.board.Board;

public interface GameManagerInterface {
    void play();

    boolean isOver();

    boolean hasWinner(Player player, Coordonnees coordonnees, Board board);

    boolean isBoardFull(Board board);

    void getMoveFromPlayer();
}
