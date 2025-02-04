import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class Board {
    
    Property[][] properties = new Property[11][11];
    static Map<Integer, Property> propertiesMap = new HashMap<>();

    public Board() {

        Display.properties= properties;

        properties[10][10] = new Property(new Color(205, 230, 208), "Go", 0, 0, null, false, false, false, false, false);
        properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", 200, 220, new int[]{50,100,200,600,1400,1700,2000}, false, false, true, false, false);
        properties[10][8] = new Property(new Color(205, 230, 208), "Luxury Tax", 0, 0, null, false, false, false, false, false);
        properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", 175, 193, new int[]{35,70,175,500,1100,1300,1500}, false, false, true, false, false);
        properties[10][6] = new Property(new Color(205, 230, 208), "Chance", 0, 0, null, false, false, false, true, false);
        properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", 160, 176, new int[]{28,56,150,450,1000,1200,1400}, false, false, true, false, false);
        properties[10][3] = new Property(new Color(205, 230, 208), "Community Chest", 0, 0, null, false, false, false, false, true);
        properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", 150, 165, new int[]{26,52,130,390,900,1100,1275}, false, false, true, false, false);
        properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", 150, 165, new int[]{26,52,130,390,900,1100,1275}, false, false, true, false, false);
        properties[10][0] = new Property(new Color(205, 230, 208), "Go to Jail", 0, 0, null, false, false, false, false, false);

        properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", 140, 154, new int[]{24,48,120,360,850,1025,1200}, false, false, true, false, false);
        properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", 75, 83, new int[]{}, false, true, true, false, false);
        properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", 130, 143, new int[]{22,44,110,330,800,975,1150}, false, false, true, false, false);
        properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", 130, 143, new int[]{22,44,110,330,800,975,1150}, false, false, true, false, false);
        properties[5][0] = new Property(new Color(0, 0, 0), "B.&O. Railroad", 100, 110, new int[]{25,50,100,200}, true, false, true , false, false);
        properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", 120, 132, new int[]{20,40,100,300,750,925,1100}, false, false, true, false, false);
        properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", 110, 121, new int[]{18,36,90,250,700,875,1050}, false, false, true, false, false);
        properties[2][0] = new Property(new Color(205, 230, 208), "Chance", 0, 0, null, false, false, false, true, false);
        properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", 110, 121, new int[]{18,36,90,250,700,875,1050}, false, false, true, false, false);
        properties[0][0] = new Property(new Color(205, 230, 208), "Free Parking", 0, 0, null, false, false, false, false, false);

        properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", 100, 110, new int[]{16,32,80,220,600,800,1000}, false, false, true, false, false);
        properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", 90, 99, new int[]{14,28,70,200,550,750,950}, false, false, true, false, false);
        properties[0][3] = new Property(new Color(205, 230, 208), "Community Chest", 0, 0, null, false, false, false, false, true);
        properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", 90, 99, new int[]{14,28,70,200,550,750,950}, false, false, true, false, false);
        properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", 80, 88, new int[]{12,24,60,180,500,700,900}, false, false, true, false, false);
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", 70, 77, new int[]{10,20,50,155,450,625,750}, false, false, true, false, false);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Company", 0, 0, new int[]{}, false, true, true, false, false); 
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", 70, 77, new int[]{10,20,50,155,450,625,750}, false, false, true, false, false);   
        properties[0][10] = new Property(new Color(205, 230, 208), "Jail",  0, 0, null, false, false, false, false, false);

        properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", 60, 66, new int[]{8,16,40,100,300,450,600}, false, false, true, false, false);
        properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", 50, 55, new int[]{6,12,30,90,270,400,550}, false, false, true, false, false);
        properties[3][10] = new Property(new Color(205, 230, 208), "Chance", 0, 0, null, false, false, false, true, false);
        properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", 55, 55, new int[]{6,12,30,90,270,400,550}, false, false, true, false, false);
        properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[6][10] = new Property(new Color(205, 230, 208), "Income Tax", 0, 0, null, false, false, false, false, false);
        properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", 30, 33, new int[]{4,8,20,60,180,320,450}, false, false, true, false, false);
        properties[8][10] = new Property(new Color(205, 230, 208), "Community Chest", 0, 0, null, false, false, false, false, true);
        properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", 30, 33, new int[]{2,14,10,30,90,160,250}, false, false, true, false, false);
    
        propertiesMap.put(1, properties[10][10]); // Go
        propertiesMap.put(2, properties[9][10]);  // Mediterranean Avenue
        propertiesMap.put(3, properties[8][10]);  // Community Chest
        propertiesMap.put(4, properties[7][10]);  // Baltic Avenue
        propertiesMap.put(5, properties[6][10]);  // Income Tax
        propertiesMap.put(6, properties[5][10]);  // Reading Railroad
        propertiesMap.put(7, properties[4][10]);  // Oriental Avenue
        propertiesMap.put(8, properties[3][10]);  // Chance
        propertiesMap.put(9, properties[2][10]);  // Vermont Avenue
        propertiesMap.put(10, properties[1][10]); // Connecticut Avenue
        propertiesMap.put(11, properties[0][10]); // Jail

        propertiesMap.put(12, properties[0][9]);  // St. Charles Place
        propertiesMap.put(13, properties[0][8]);  // Electric Company
        propertiesMap.put(14, properties[0][7]);  // States Avenue
        propertiesMap.put(15, properties[0][6]);  // Virginia Avenue
        propertiesMap.put(16, properties[0][5]);  // Pennsylvania Railroad
        propertiesMap.put(17, properties[0][4]);  // St. James Place
        propertiesMap.put(18, properties[0][3]);  // Community Chest
        propertiesMap.put(19, properties[0][2]);  // Tennessee Avenue
        propertiesMap.put(20, properties[0][1]);  // New York Avenue
        propertiesMap.put(21, properties[0][0]);  // Free Parking

        propertiesMap.put(22, properties[1][0]);  // Kentucky Avenue
        propertiesMap.put(23, properties[2][0]);  // Chance
        propertiesMap.put(24, properties[3][0]);  // Indiana Avenue
        propertiesMap.put(25, properties[4][0]);  // Illinois Avenue
        propertiesMap.put(26, properties[5][0]);  // B&O Railroad
        propertiesMap.put(27, properties[6][0]);  // Atlantic Avenue
        propertiesMap.put(28, properties[7][0]);  // Ventnor Avenue
        propertiesMap.put(29, properties[8][0]);  // Water Works
        propertiesMap.put(30, properties[9][0]);  // Marvin Gardens
        propertiesMap.put(31, properties[10][0]); // Go to Jail

        propertiesMap.put(32, properties[10][1]); // Pacific Avenue
        propertiesMap.put(33, properties[10][2]); // North Carolina Avenue
        propertiesMap.put(34, properties[10][3]); // Community Chest
        propertiesMap.put(35, properties[10][4]); // Pennsylvania Avenue
        propertiesMap.put(36, properties[10][5]); // Short Line Railroad
        propertiesMap.put(37, properties[10][6]); // Chance
        propertiesMap.put(38, properties[10][7]); // Park Place
        propertiesMap.put(39, properties[10][8]); // Luxury Tax
        propertiesMap.put(40, properties[10][9]); // Boardwalk

        for (Map.Entry<Integer, Property> entry : propertiesMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue().getName());
        }
        


    }
}