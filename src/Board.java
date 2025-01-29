import java.awt.Color;

public class Board {
    Property[][] properties = new Property[11][11];


    public Board() {
        Display.properties= properties;
        properties[0][0] = new Property(new Color(255, 255, 204), "Go", "0", 0, 0);
        properties[0][1] = new Property(new Color(102, 51, 0), "Mediterranean Avenue", "60",30, 33);
        properties[0][2] = new Property(new Color(255, 255, 204), "Community Chest", "0", 0, 0);
        properties[0][3] = new Property(new Color(102, 51, 0), "Baltic Avenue", "60", 30, 33);
        properties[0][4] = new Property(new Color(255, 255, 204), "Income Tax", "0", 0, 0);
        properties[0][5] = new Property(new Color(0, 0, 0), "Reading Railroad", "200", 100, 110);
        properties[0][6] = new Property(new Color(0, 153, 204), "Oriental Avenue", "100",50,55);
        properties[0][7] = new Property(new Color(255, 255, 204), "Chance", "0", 0, 0);
        properties[0][8] = new Property(new Color(0, 153, 204), "Vermont Avenue", "100", 50, 55);
        properties[0][9] = new Property(new Color(0, 153, 204), "Connecticut Avenue", "120", 60, 66);

        properties[0][10] = new Property(new Color(255, 102, 0), "Jail", "0", 0, 0);
        properties[1][10] = new Property(new Color(204, 68, 204), "St. Charles Place", "140", 70, 77);
        properties[2][10] = new Property(new Color(255, 255, 255), "Electric Company", "150", 75, 83);
        properties[3][10] = new Property(new Color(204, 68, 204), "States Avenue", "140", 70, 77);
        properties[4][10] = new Property(new Color(204, 68, 204), "Virginia Avenue", "60",80,88);
        properties[5][10] = new Property(new Color(0, 0, 0),"Pennsylvania Railroad", "200", 100, 110);
        properties[6][10] = new Property(new Color(204, 68, 204), "St. James Place", "180",90,99);
        properties[7][10] = new Property(new Color(255, 255, 204),"Community Chest", "0", 0, 0);
        properties[8][10] = new Property(new Color(204, 68, 204), "Tennessee Avenue", "180",90,99);
        properties[9][10] = new Property(new Color(204, 68, 204), "New York Avenue", "200", 100, 110);

        properties[10][10] = new Property(new Color(255, 255, 204), "Free Parking", "0", 0, 0);
        properties[10][9] = new Property(new Color(255, 0, 0), "Kentucky Avenue", "220",110,121);
        properties[10][8] = new Property(new Color(255, 255, 204), "Chance", "0", 0, 0);
        properties[10][7] = new Property(new Color(255, 0, 0), "Indiana Avenue", "220", 110, 121);
        properties[10][6] = new Property(new Color(255, 0, 0), "Illinois Avenue", "240",120,132);
        properties[10][5] = new Property(new Color(0, 0, 0),"B. & O. Railroad", "200", 100, 110);
        properties[10][4] = new Property(new Color(255, 255, 51), "Atlantic Avenue", "260",130,143);
        properties[10][3] = new Property(new Color(255, 255, 51), "Ventnor Avenue", "260", 130, 143);
        properties[10][2] = new Property(new Color(255, 255, 255), "Water Works", "150", 75, 83);
        properties[10][1] = new Property(new Color(255, 255, 51), "Marvin Gardens", "280",140,154);
        
        properties[10][0] = new Property(new Color(255, 255, 204), "Go to Jail", "0", 0, 0);
        properties[9][0] = new Property(new Color(51, 153, 51), "Pacific Avenue", "300", 150, 165);
        properties[8][0] = new Property(new Color(51, 153, 51), "North Carolina Avenue", "300" , 150 ,165);
        properties[7][0] = new Property(new Color(255, 255, 204), "Community Chest", "0", 0, 0);
        properties[6][0] = new Property(new Color(51, 153, 51), "Pennsylvania Avenue", "320",160,176);
        properties[5][0] = new Property(new Color(0, 0, 0), "Short Line Railroad", "200", 100, 110);
        properties[4][0] = new Property(new Color(255, 255, 204), "Chance", "0" ,0 ,0);
        properties[3][0] = new Property(new Color(51, 153, 51), "Park Place", "350", 175, 193);
        properties[2][0] = new Property(new Color(255, 255, 204), "Luxury Tax", "100", 0, 0);
        properties[1][0] = new Property(new Color(51, 153, 51), "Boardwalk", "400",200,220);

    }
    
}
