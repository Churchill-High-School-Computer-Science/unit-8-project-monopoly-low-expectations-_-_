import java.awt.Color;

public class Property {

    private final Color color;
    private final String name;
    private final String owner;
    private  int numHouses;
    private final int mortgage;
    private final int unmortgage;
    private  int baseRent;
    private  int[] houseRents;
    private  boolean isRailroad;
    private  boolean isUtility;
    private boolean isPurchasable;  
    private boolean isChance;
    private boolean isCommunityChest;

    public Property(Color c, String n, String o, int nH, int m, int um, int bR, int[] hR, boolean iR, boolean iU, boolean iP, boolean iC, boolean iCC)
    {

        color = c;
        name = n;
        owner = o;
        numHouses = nH;
        mortgage = m;
        unmortgage = um;
        baseRent = bR;
        houseRents = hR;
        isRailroad = iR;
        isUtility = iU;
        isPurchasable = iP;
        isChance = iC;
        isCommunityChest = iCC; 
    }

    public Color getColor(){
        return color;
    }

    public String getName(){
        return name;
    }

    public int getNumHouses(){
        return numHouses;
    }

    public String getOwner(){
        return owner;
    }

    public int getRent(){
        return 20;
    }

    public void addHouse(){
        if (numHouses < houseRents.length){
            numHouses++;
        }
    }
}
