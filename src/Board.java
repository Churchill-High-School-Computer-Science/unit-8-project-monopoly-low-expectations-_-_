import java.awt.Color;

public class Board {
    Property[][] properties = new Property[11][11];


    public Board() {
        Display.properties= properties;
// Bottom row (moving left from Go)
properties[10][10] = new Property(new Color(255, 255, 204), "Go", "0", 0, 0);
properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", "400", 200, 220);
properties[10][8] = new Property(new Color(255, 255, 204), "Luxury Tax", "100", 0, 0);
properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", "350", 175, 193);
properties[10][6] = new Property(new Color(255, 255, 204), "Chance", "0", 0, 0);
properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", "200", 100, 110);
properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", "320", 160, 176);
properties[10][3] = new Property(new Color(255, 255, 204), "Community Chest", "0", 0, 0);
properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", "300", 150, 165);
properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", "300", 150, 165);
properties[10][0] = new Property(new Color(255, 255, 204), "Go to Jail", "0", 0, 0);

// Left column (moving up from Go to Jail)
properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", "280", 140, 154);
properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", "150", 75, 83);
properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", "260", 130, 143);
properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", "260", 130, 143);
properties[5][0] = new Property(new Color(0, 0, 0), "B. & O. Railroad", "200", 100, 110);
properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", "240", 120, 132);
properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", "220", 110, 121);
properties[2][0] = new Property(new Color(255, 255, 204), "Chance", "0", 0, 0);
properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", "220", 110, 121);
properties[0][0] = new Property(new Color(255, 255, 204), "Free Parking", "0", 0, 0);

// Top row (moving right from Free Parking)
properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", "200", 100, 110);
properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", "180", 90, 99);
properties[0][3] = new Property(new Color(255, 255, 204), "Community Chest", "0", 0, 0);
properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", "180", 90, 99);
properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", "200", 100, 110);
properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", "160", 80, 88);
properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", "140", 70, 77);
properties[0][8] = new Property(new Color(255, 255, 255), "Electric Company", "150", 75, 83);
properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", "140", 70, 77);
properties[0][10] = new Property(new Color(255, 102, 0), "Jail", "0", 0, 0);

// Right column (moving down from Jail)
properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", "120", 60, 66);
properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", "100", 50, 55);
properties[3][10] = new Property(new Color(255, 255, 204), "Chance", "0", 0, 0);
properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", "100", 50, 55);
properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", "200", 100, 110);
properties[6][10] = new Property(new Color(255, 255, 204), "Income Tax", "0", 0, 0);
properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", "60", 30, 33);
properties[8][10] = new Property(new Color(255, 255, 204), "Community Chest", "0", 0, 0);
properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", "60", 30, 33);


    }
    
}
