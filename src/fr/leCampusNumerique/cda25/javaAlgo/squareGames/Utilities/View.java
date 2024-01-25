package fr.leCampusNumerique.cda25.javaAlgo.squareGames.Utilities;

public class View {
    // This class will be singleton
    private static View instance;

    private View(){};

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
}
