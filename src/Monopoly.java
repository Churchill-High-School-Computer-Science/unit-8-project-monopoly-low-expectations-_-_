import javax.swing.SwingUtilities;

public class Monopoly {

    public static void main(String[] args) {



        Board board = new Board();

        Player owen = new Player("owen");
        Display.players.add(owen);
        Player allen = new Player("allen");
        Display.players.add(allen);
        Player crace = new Player("crace");
        Display.players.add(crace);
        Player bob = new Player("bob");
        Display.players.add(bob);


        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());

    }

}
