package fr.leCampusNumerique.cda25.javaAlgo.squareGames.board;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Player.Player;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities.Coordonnees;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.Cell;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.symbols.CellFactory;

import java.util.HashMap;

public class Board implements BoardInterface {

    private HashMap<Coordonnees, Cell> board;
    int x;
    int y;
    String type;
    private CellFactory cellFactory = new CellFactory();

    public Board(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.board = new HashMap<Coordonnees, Cell>();
        initializeBoard(x, y, type);
        //initializeBoardFreeCases(this.size);
    }
    @Override
    public  void initializeBoard(int x, int y, String type) {
        for (int i=1; i<x+1;i++ ){
            for (int j=1; j<y+1;j++){
                board.put(new Coordonnees(i, j), cellFactory.createCell("ticTacToe"));
            }
        }
    }

    @Override
    public HashMap<Coordonnees,Cell> getFreeCells(Coordonnees coordonnees) {
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


    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Cell getCellInPositionXY(int x, int y){
        //System.out.println("Testi:" + board.get(new Coordonnees(x,y)).getRepresentation());
        return board.get(new Coordonnees(x,y));
        //return board.equals(new Coordonnees(x,y));
    }
}
