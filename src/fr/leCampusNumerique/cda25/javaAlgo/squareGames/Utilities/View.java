package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

import fr.leCampusNumerique.cda25.javaAlgo.squareGames.board.Board;
import fr.leCampusNumerique.cda25.javaAlgo.squareGames.cell.CellFactory;

public class View {
    // This class will be singleton
    private static View instance;
    private CellFactory cellFactory;

    private View(){
        cellFactory = new CellFactory();
    };

    public static View getInstance(){
        if (instance == null){
            instance = new View();
        }
        return instance;
    }

    public void showOneLineMsg(String msg){
        System.out.println(msg);
    }


    // TODO REFACTOR: fuction showGameList() and showModeList() almost the same
    public void showGameList(){
        this.showOneLineMsg("Please Choose Your Game ");
        this.showOneLineMsg("  1) Tic Tac Toe");
        this.showOneLineMsg("  2) Gomoku");
        this.showOneLineMsg("  3) Connect 4");

    }

    public void showModeList(){
        this.showOneLineMsg("Please Choose Your Mode ");
        this.showOneLineMsg("  1) Human vs. Human");
        this.showOneLineMsg("  2) Human vs. AI");
        this.showOneLineMsg("  3) AI vs. AI");

    }

    public void displayBoardWithHorizontalLines(Board board) {
       printSeparationLine(board.getX(), board.getType());
        for (int i = 0; i < board.getX(); i++) {
            for (int j = 0; j < board.getY(); j++) {
                System.out.print(board.getCellInPositionXY(i + 1, j + 1).getRepresentation());
            }
            printEndLine();
            printSeparationLine(board.getX(), board.getType());
        }
    }

    public void displayBoardWithoutHorizontalLines(Board board) {
        printSeparationLine(board.getX(), board.getType());
        for (int i = 0; i < board.getY(); i++) {
            for (int j = 0; j < board.getX(); j++) {
                System.out.print(board.getCellInPositionXY(i + 1, j + 1).getRepresentation());
            }
            printEndLine();
        }
        printSeparationLine(board.getX(), board.getType());
    }

    private void printEndLine(){
        System.out.println("|");
    }

   private void printSeparationLine(int size, String type){
        for (int i = 0; i< size; i++) {
            //Make it as long as the cell's representation string
            int lengthOfCell = cellFactory.createCell(type).getRepresentation().length();
            for(int j = 0; j < lengthOfCell; j++){
                System.out.print("_");
            }
        }
    System.out.println();
    }
}
