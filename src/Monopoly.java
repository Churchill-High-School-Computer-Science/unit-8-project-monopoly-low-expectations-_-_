import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {

        Board board = new Board();

        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());

    }
}
