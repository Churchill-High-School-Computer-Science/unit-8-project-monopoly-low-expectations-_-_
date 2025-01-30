import java.awt.Color;

public class Board {
    
    Property[][] properties = new Property[11][11];

    public Board() {

        Display.properties= properties;

        properties[10][10] = new Property(new Color(205, 230, 208), "Go", null, 0, 0, 0, null, false, false, false, false, false);
        properties[10][9] = new Property(new Color(0, 114, 187), "Boardwalk", null, 0, 200, 220, new int[]{50,100,200,600,1400,1700,2000}, false, false, true, false, false);
        properties[10][8] = new Property(new Color(205, 230, 208), "Luxury Tax", null, 0, 0, 0, null, false, false, false, false, false);
        properties[10][7] = new Property(new Color(0, 114, 187), "Park Place", null, 0, 175, 193, new int[]{35,70,175,500,1100,1300,1500}, false, false, true, false, false);
        properties[10][6] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, null, false, false, false, true, false);
        properties[10][5] = new Property(new Color(0, 0, 0), "Short Line Railroad", null, 0, 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[10][4] = new Property(new Color(31, 178, 90), "Pennsylvania Avenue", null, 0, 160, 176, new int[]{28,56,150,450,1000,1200,1400}, false, false, true, false, false);
        properties[10][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, null, false, false, false, false, true);
        properties[10][2] = new Property(new Color(31, 178, 90), "North Carolina Avenue", null, 0, 150, 165, new int[]{26,52,130,390,900,1100,1275}, false, false, true, false, false);
        properties[10][1] = new Property(new Color(31, 178, 90), "Pacific Avenue", null, 0, 150, 165, new int[]{26,52,130,390,900,1100,1275}, false, false, true, false, false);
        properties[10][0] = new Property(new Color(205, 230, 208), "Go to Jail", null, 0, 0, 0, null, false, false, false, false, false);

        properties[9][0] = new Property(new Color(254, 242, 0), "Marvin Gardens", null, 0, 140, 154, new int[]{24,48,120,360,850,1025,1200}, false, false, true, false, false);
        properties[8][0] = new Property(new Color(255, 255, 255), "Water Works", null, 0, 75, 83, new int[]{}, false, true, true, false, false);
        properties[7][0] = new Property(new Color(254, 242, 0), "Ventnor Avenue", null, 0, 130, 143, new int[]{22,44,110,330,800,975,1150}, false, false, true, false, false);
        properties[6][0] = new Property(new Color(254, 242, 0), "Atlantic Avenue", null, 0, 130, 143, new int[]{22,44,110,330,800,975,1150}, false, false, true, false, false);
        properties[5][0] = new Property(new Color(0, 0, 0), "B.&O. Railroad", null, 0, 100, 110, new int[]{25,50,100,200}, true, false, true , false, false);
        properties[4][0] = new Property(new Color(237, 27, 36), "Illinois Avenue", null, 0, 120, 132, new int[]{20,40,100,300,750,925,1100}, false, false, true, false, false);
        properties[3][0] = new Property(new Color(237, 27, 36), "Indiana Avenue", null, 0, 110, 121, new int[]{18,36,90,250,700,875,1050}, false, false, true, false, false);
        properties[2][0] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, null, false, false, false, true, false);
        properties[1][0] = new Property(new Color(237, 27, 36), "Kentucky Avenue", null, 0, 110, 121, new int[]{18,36,90,250,700,875,1050}, false, false, true, false, false);
        properties[0][0] = new Property(new Color(205, 230, 208), "Free Parking", null, 0, 0, 0, null, false, false, false, false, false);

        properties[0][1] = new Property(new Color(247, 148, 29), "New York Avenue", null, 0, 100, 110, new int[]{16,32,80,220,600,800,1000}, false, false, true, false, false);
        properties[0][2] = new Property(new Color(247, 148, 29), "Tennessee Avenue", null, 0, 90, 99, new int[]{14,28,70,200,550,750,950}, false, false, true, false, false);
        properties[0][3] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, null, false, false, false, false, true);
        properties[0][4] = new Property(new Color(247, 148, 29), "St. James Place", null, 0, 90, 99, new int[]{14,28,70,200,550,750,950}, false, false, true, false, false);
        properties[0][5] = new Property(new Color(0, 0, 0), "Pennsylvania Railroad", null, 0, 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[0][6] = new Property(new Color(217, 58, 150), "Virginia Avenue", null, 0, 80, 88, new int[]{12,24,60,180,500,700,900}, false, false, true, false, false);
        properties[0][7] = new Property(new Color(217, 58, 150), "States Avenue", null, 0, 70, 77, new int[]{10,20,50,1550,450,625,750}, false, false, true, false, false);
        properties[0][8] = new Property(new Color(255, 255, 255), "Electric Compan", null, 0, 0, 0, new int[]{}, false, true, true, false, false); 
        properties[0][9] = new Property(new Color(217, 58, 150), "St. Charles Place", null, 0, 70, 77, new int[]{10,20,50,1550,450,625,750}, false, false, true, false, false);   
        properties[0][10] = new Property(new Color(205, 230, 208), "Jail", "0", 0, 0, 0, null, false, false, false, false, false);

        properties[1][10] = new Property(new Color(170, 224, 250), "Connecticut Avenue", null, 0, 60, 66, new int[]{8,16,40,100,300,450,600}, false, false, true, false, false);
        properties[2][10] = new Property(new Color(170, 224, 250), "Vermont Avenue", null, 0, 50, 55, new int[]{6,12,30,90,270,400,550}, false, false, true, false, false);
        properties[3][10] = new Property(new Color(205, 230, 208), "Chance", null, 0, 0, 0, null, false, false, false, true, false);
        properties[4][10] = new Property(new Color(170, 224, 250), "Oriental Avenue", null, 0, 55, 55, new int[]{6,12,30,90,2}, false, false, true, false, false);
        properties[5][10] = new Property(new Color(0, 0, 0), "Reading Railroad", null, 0, 100, 110, new int[]{25,50,100,200}, true, false, true, false, false);
        properties[6][10] = new Property(new Color(205, 230, 208), "Income Tax", null, 0, 0, 0, null, false, false, false, false, false);
        properties[7][10] = new Property(new Color(139,87,59), "Baltic Avenue", null, 0, 30, 33, new int[]{4,8,20,60,180,320,450}, false, false, true, false, false);
        properties[8][10] = new Property(new Color(205, 230, 208), "Community Chest", null, 0, 0, 0, null, false, false, false, false, true);
        properties[9][10] = new Property(new Color(139,87,59), "Mediterranean Avenue", null, 0, 30, 33, new int[]{2,14,10,30,90,160,250}, false, false, true, false, false);
    }
}
