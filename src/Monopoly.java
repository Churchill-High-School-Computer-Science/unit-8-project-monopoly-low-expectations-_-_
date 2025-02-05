import javax.swing.SwingUtilities;

public class Monopoly {

    static int turn = 1;
    static Player owen = new Player("owen");
    static Player allen = new Player("allen");
    static Player crace = new Player("crace");
    static Player bob = new Player("bob");

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
