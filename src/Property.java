
import java.awt.Color;

public class Property {

    Color color;
    String name;
    String owner;
    int numHouses;
    int mortgage;
    int unmortgage;

    public Property(Color c, String n, String o, int m, int um)
    {

        color = c;
        name = n;
        owner = o;
        mortgage = m;
        unmortgage = um;
    }

    //TODO fix
    public Color getColor(){
        return color;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return numHouses;
    }

    //TODO fix
    public String getOwner(){
        return "no one";
    }

    //TODO fix
    public int getRent(){
        return 20;
    }
}
