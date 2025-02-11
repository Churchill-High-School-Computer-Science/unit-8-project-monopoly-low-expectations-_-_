import java.awt.Color;

public class Property {
    private final Color color;
    private final String name;
    private Player owner = null;
    private final int price;
    private int numHouses;//sigma boy sigma sigma owen was not herer
    private final int mortgage;
    private final int unmortgage;
    private final int[] houseRents;
    private final boolean isRailroad;
    private final boolean isUtility;
    private boolean isPurchasable;
    private final boolean isChance;
    private final boolean isCommunityChest;

    public Property(Color c, String n, int p, int m, int um, int[] hR, boolean iR, boolean iU, boolean iP, boolean iC, boolean iCC) {
        this.color = c;
        this.name = n;
        this.price = p;
        this.mortgage = m;
        this.unmortgage = um;
        this.houseRents = hR;
        this.isRailroad = iR;
        this.isUtility = iU;
        this.isPurchasable = iP;
        this.isChance = iC;
        this.isCommunityChest = iCC;
    }

    public Color getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public void removeOwner() {
        this.owner = null;
    }

    public int getPrice() {
        return price;
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
        if (numHouses >= houseRents.length) {
            return houseRents[houseRents.length - 1]; 
        }
        if (numHouses > 0) {
            return houseRents[numHouses];
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

    public void setPurchasable(boolean purchasable) {
        this.isPurchasable = purchasable;
    }

    public boolean isChance() {
        return isChance;
    }

    public boolean isCommunityChest() {
        return isCommunityChest;
    }
}
