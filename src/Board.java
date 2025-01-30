import java.awt.Color;

public class Board {
    
    Property[][] properties = new Property[11][11];

    public Board() {

        Display.properties= properties;

        properties[10][10] = new Property(new Color(205, 230, 208), "Go", null, 0, 0, 0, 0, null, false, false, false, false, false);
        properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][8] = new Property(new Color(205, 230, 208), "Luxury Tax", null, 0, 0, 0, 0, null, false, false, false, false, false);
        properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][6] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, 0, null, false, false, false, true, false);
        properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true, false, false);
        properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, 0, null, false, false, false, false, true);
        properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[10][0] = new Property(new Color(205, 230, 208), "Go to Jail", null, 0, 0, 0, 0, null, false, false, false, false, false);

        properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", null, 0, 0, 0, 0, new int[]{}, false, true, true, false, false);
        properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[5][0] = new Property(new Color(0, 0, 0), "B.&O. Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true , false, false);
        properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[2][0] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, 0, null, false, false, false, true, false);
        properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][0] = new Property(new Color(205, 230, 208), "Free Parking", null, 0, 0, 0, 0, null, false, false, false, false, false);

        properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, 0, null, false, false, false, false, true);
        properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", null, 0, 0, 0, 0, new int[]{}, true, false, true, false, false);
        properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", null, 0, 88, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Compan", null, 0, 0, 0, 0, new int[]{}, false, true, true, false, false);
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", null, 0, 0, 0, 0, new int[]{}, false, false, true, false, false);   
        properties[0][10] = new Property(new Color(205, 230, 208), "Jail", "0", 0, 0, 0, 0, null, false, false, false, false, false);

        properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", "120", 60, 66, 0, 0, null, false, false, false, false, false);
        properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", "100", 50, 55, 0, 0, null, false, false, false, false, false);
        properties[3][10] = new Property(new Color(205, 230, 208), "Chance", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", "100", 50, 55, 0, 0, null, false, false, false, false, false);
        properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", "200", 100, 110, 0, 0, null, false, false, false, false, false);
        properties[6][10] = new Property(new Color(205, 230, 208), "Income Tax", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", "60", 30, 33, 0, 0, null, false, false, false, false, false);
        properties[8][10] = new Property(new Color(205, 230, 208), "Community Chest", "0", 0, 0, 0, 0, null, false, false, false, false, false);
        properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", "60", 30, 33, 0, 0, null, false, false, false, false, false);
    }
}
