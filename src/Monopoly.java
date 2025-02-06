import javax.swing.SwingUtilities;

public class Monopoly {

    static int turn = 1;
    static Player owen = new Player("1");
    static Player allen = new Player("2");
    static Player crace = new Player("3");
    static Player bob = new Player("4");

    public static void main(String[] args) {



        Board board = new Board();

        Display.players.add(owen);
        
        Display.players.add(allen);
        
        Display.players.add(crace);
        
        Display.players.add(bob);


        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());

    }

}
