import java.awt.Color;

public class Property {

    private final Color color;
    private final String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String owner;
    @SuppressWarnings("FieldMayBeFinal")
    private int numHouses;
    private final int mortgage;
    private final int unmortgage;
    @SuppressWarnings("FieldMayBeFinal")
    private int[] houseRents;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean isRailroad;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean isUtility;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean isPurchasable;  
    @SuppressWarnings("FieldMayBeFinal")
    private boolean isChance;
    @SuppressWarnings("FieldMayBeFinal")
    private boolean isCommunityChest;

    public Property(Color c, String n, int m, int um, int[] hR, boolean iR, boolean iU, boolean iP, boolean iC, boolean iCC) {
        color = c;
        name = n;
        mortgage = m;
        unmortgage = um;
        houseRents = hR;
        isRailroad = iR;
        isUtility = iU;
        isPurchasable = iP;
        isChance = iC;
        isCommunityChest = iCC; 
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumHouses() {
        return numHouses;
    }

    public int getMortgage() {
        return mortgage;
    }

    public int getUnmortgage() { 
        return unmortgage;
    }

    public int getRent(Player owner, int numHouses, boolean colorset) {
        if (numHouses > 0) {
            return houseRents[numHouses + 1]; 
        } else if (colorset) {
            return houseRents[1]; 
        } else {
            return houseRents[0];
        }
    }

    public boolean isRailroad() {
        return isRailroad;
    }

    public boolean isUtility() {
        return isUtility;
    }

    public boolean isPurchasable() {
        return isPurchasable;
    }

    public boolean isChance() {
        return isChance;
    }

    public boolean isCommunityChest() {
        return isCommunityChest;
    }
}
