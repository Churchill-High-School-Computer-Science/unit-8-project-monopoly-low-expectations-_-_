import java.awt.Color;

public class Property {

    private final Color color;
    private final String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String owner;
    private int numHouses;
    private final int mortgage;
    private final int unmortgage;
    private  int[] houseRents;
    private  boolean isRailroad;
    private  boolean isUtility;
    private boolean isPurchasable;  
    private boolean isChance;
    private boolean isCommunityChest;

    public Property(Color c, String n, String o, int nH, int m, int um, int[] hR, boolean iR, boolean iU, boolean iP, boolean iC, boolean iCC)
    {

        color = c;
        name = n;
        owner = o;
        numHouses = nH;
        mortgage = m;
        unmortgage = um;
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

    public String getOwner(){
        return owner;
    }

    public int getNumHouses(){
        return numHouses;
    }

    public int getMorgage(){
        return mortgage;
    }

    public int getUnMorgage(){
        return unmortgage;
    }


    public int[] getRent(){
        return houseRents;
    }

    public boolean isRailroad(){
        return isRailroad;
    }

    public boolean isUtility(){
        return isUtility;
    }

    public boolean isPurchasable(){
        return isPurchasable;
    }

    public boolean isChance(){
        return isChance;
    }

    public boolean isCommunityChest(){
        return isCommunityChest;
    }

}
