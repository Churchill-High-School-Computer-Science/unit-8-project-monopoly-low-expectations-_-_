import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Display extends JFrame {

    static Property[][] properties = new Property[11][11];
    static ArrayList<Player> players = new ArrayList<>(1);
    static JButton communityChest = new JButton("Community Chest");
    static JButton chance = new JButton("Chance");
    static JButton dice = new JButton("Roll Dice");
    static JLabel diceDisplay = new JLabel();
    static JFrame frame = new JFrame("Monopoly Game");
    static JPanel boardPanel = new JPanel() {
    
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            g2d.setColor(new Color(205, 230, 208));
            g2d.fillRect(0, 0, 75 * 11, 75 * 11);

            g2d.setColor(Color.BLACK);
            for (int i = 0; i < properties.length; i++) {
                for (int j = 0; j < properties[i].length; j++) {
                    if (i == 0 || i == 10 || j == 0 || j == 10) {
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(i * 75, j * 75, 75, 75);
                         if (properties[i][j] != null) {
                            drawProperty(properties[i][j], g2d, i, j);
                        }
                         
                    }
                }
            }

            drawPlayerAssets(g2d);
            drawPlayers(g2d);
        }

        public void drawPlayers(Graphics g2d){
            
            if(players != null && !players.isEmpty()){
                int playerOffset = 1;
                for(Player p:players){
                    int xoffset = 0;
                    int yoffset = 0;

                    if (p.getLocation() < 11) { 
                        xoffset = 750 - (p.getLocation() * 75);
                        yoffset = 750;
                    }

                    else if (p.getLocation() > 19 && p.getLocation() < 31) { 
                        xoffset = 0 + ((p.getLocation() - 20) * 75);
                        yoffset = 0;
                    }

                    else if (p.getLocation() > 10 && p.getLocation() < 20) { 
                        yoffset = 750 - ((p.getLocation() - 10) * 75);
                        xoffset = 750;
                    }

                    else if (p.getLocation() > 30 && p.getLocation() < 40) { 
                        yoffset = 0 + ((p.getLocation() - 30) * 75);
                        xoffset = 0;
                    }
                    else{
                        System.out.println("Invalid player location.");
                        System.out.println(p.getLocation());
                    }

                    g2d.setColor(new Color(255, 0, 255));
                    g2d.fillOval(xoffset + playerOffset * 18 - 15, yoffset + 30, 15, 15);
                    g2d.setColor(new Color(255, 255, 255));
                    g2d.drawString(Integer.toString(playerOffset), xoffset + playerOffset * 18 - 10, yoffset + 43);

                    playerOffset += 1;
                }
            }
        }

        private void drawProperty(Property p, Graphics2D g2d, int x, int y) {

            // Draw color bar
            g2d.setColor(p.getColor());
            g2d.fillRect(x * 75, y * 75, 75, 75 / 4);

            // Draw property name
            int nameOffset = y * 75 + 65;
            g2d.setColor(Color.BLACK);
            g2d.setFont(new Font("SansSerif", Font.PLAIN, 10));
            if(p.getName().length() > 12){
                String[] names = p.getName().split(" ");
                if(names.length == 3){
                    nameOffset -= 10;
                    g2d.drawString(names[0] + names[1], x * 75 + 5, nameOffset);
                    nameOffset += 10;
                    g2d.drawString(names[2], x * 75 + 5, nameOffset);
                }
                else{
                    nameOffset -= 10;
                    g2d.drawString(names[0], x * 75 + 5, nameOffset);
                    nameOffset += 10;
                    g2d.drawString(names[1], x * 75 + 5, nameOffset);
                }
 
            }
            else{
                g2d.drawString(p.getName(), x * 75 + 5, nameOffset);
            }
            //Draw houses
            g2d.setColor(new Color(50, 168, 82));
            int offset = 0;
            for(int i = 0; i < p.getNumHouses(); i++){
                g2d.fillOval(x * 75 + offset, y*75, 10, 10);
                offset += 10;
            }
        }

        private void drawPlayerAssets(Graphics2D g2d) {

            
            int playerOffset = 0;
            int propertyOffset = 25;

            if(players != null && !players.isEmpty()){
                for(Player player: players){
                    propertyOffset = 25;
                    g2d.setColor(Color.BLACK);
                    g2d.drawString(player.getName(), 150 + playerOffset, 300);
                    g2d.drawString("$" + player.getMoney(), 150 + playerOffset, 300 + 18);


                    if(player.getProperties() != null && !player.getProperties().isEmpty()){
                        for(Property property : player.getProperties()){
                            g2d.setColor(property.getColor());
                            g2d.fillRect(150 + playerOffset, 300 + propertyOffset, 75, 75 / 4);

                            // Draw property name
                            g2d.setColor(Color.BLACK);
                            g2d.drawString(property.getName(), 150 + playerOffset, 300 + propertyOffset + 15);

                            propertyOffset += 20;
                        }

                       
                    }

                    playerOffset += 150;
                }
            }
        }
    };

    @SuppressWarnings("Convert2Lambda")
    public static void setupFrame() {

        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(null); // Allow manual positioning

        // Configure buttons
        communityChest.setBackground(new Color(51, 153, 255));
        communityChest.setBounds(200, 200, 150, 50);
        frame.add(communityChest);

        chance.setBackground(new Color(255, 153, 0));
        chance.setBounds(400, 200, 150, 50);
        frame.add(chance);

        dice.setBackground(new Color(255, 153, 0));
        dice.setBounds(600, 200, 150, 50);
        frame.add(dice);


        //Config dice display
        diceDisplay.setBounds(639, 230, 100, 100);
        diceDisplay.setBackground(new Color(255, 255, 255));
        diceDisplay.setText("No rolls yet!");
        frame.add(diceDisplay);

        communityChest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards.Card card = Cards.drawRandomCommunityChestCard();
                JOptionPane.showMessageDialog(frame, card.getMessage(), "Community Chest", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        chance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cards.Card card = Cards.drawRandomChanceCard();
                JOptionPane.showMessageDialog(frame, card.getMessage(), "Community Chest", JOptionPane.INFORMATION_MESSAGE);            
            }
        });

        dice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int d = Player.rollDice();
                diceDisplay.setText(String.valueOf(d));
                if(Monopoly.turn == 1){
                    Monopoly.owen.move(d);
                }
                boardPanel.repaint();
                frame.repaint(); 
            }
        });


        // Add the custom board
        boardPanel.setBounds(50, 50, 900, 900);
        frame.add(boardPanel);
        frame.setVisible(true);
    }

    public static void inform(String text){
        JOptionPane.showMessageDialog(frame, text);
    }

    public static int choice(String title, String text, String[] options){
        return JOptionPane.showOptionDialog(frame, text, title, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options,options[0]);
    }

    public static void setDiceDisplay(String text){
        diceDisplay.setText(text);
    }
}
