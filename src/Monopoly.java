import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {

        Board board = new Board();


        Player owen = new Player("owen");
        Display.players.add(owen);

        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());

    }
}
