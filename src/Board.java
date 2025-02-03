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
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", 70, 77, new int[]{10,20,50,1550,450,625,750}, false, false, true, false, false);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Company", 0, 0, new int[]{}, false, true, true, false, false); 
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", 70, 77, new int[]{10,20,50,1550,450,625,750}, false, false, true, false, false);   
        properties[0][10] = new Property(new Color(205, 230, 208), "Jail",  0, 0, null, false, false, false, false, false);

        properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", 60, 66, new int[]{8,16,40,100,300,450,600}, false, false, true, false, false);
        properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", 50, 55, new int[]{6,12,30,90,270,400,550}, false, false, true, false, false);
        properties[3][10] = new Property(new Color(205, 230, 208), "Chance", 0, 0, null, false, false, false, true, false);
        properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", 55, 55, new int[]{6,12,30,90,2}, false, false, true, false, false);
        properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[6][10] = new Property(new Color(205, 230, 208), "Income Tax", 0, 0, null, false, false, false, false, false);
        properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", 30, 33, new int[]{4,8,20,60,180,320,450}, false, false, true, false, false);
        properties[8][10] = new Property(new Color(205, 230, 208), "Community Chest", 0, 0, null, false, false, false, false, true);
        properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", 30, 33, new int[]{2,14,10,30,90,160,250}, false, false, true, false, false);
    
    
        for (Property[] propertie : properties) {
            for (Property propertie1 : propertie) {
                if (propertie1 != null) {
                    propertiesMap.put(propertiesMap.size(), propertie1);
                }
            }
        }
        
        System.out.print(propertiesMap);
    
    }
}