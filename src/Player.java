import java.awt.Color;
import java.util.ArrayList;

/* 
                 _ _
                ( Y )
                 \ /  
                  \          /^\
                    )       //^\\
                 (         //   \\
                   )      //     \\
                  __     //       \\
                 |=^|   //    _    \\
               __|= |__//    (+)    \\
              /LLLLLLL//      ~      \\
             /LLLLLLL//               \\
            /LLLLLLL//                 \\
           /LLLLLLL//  |~[|]~| |~[|]~|  \\
           ^| [|] //   | [|] | | [|] |   \\
            | [|] ^|   |_[|]_| |_[|]_|   |^
         ___|______|                     |
        /LLLLLLLLLL|_____________________|
       /LLLLL*/public class Player {/*LLLL\
      /LLLLLLLLLLL/LLLLLLLLLLLLLLLLLLLLLLLL\
      ^||^^^^^^^^/LLLLLLLLLLLLLLLLLLLLLLLLLL\
       || |~[|]~|^^||^^^^^^^^^^||^|~[|]~|^||^^
       || | [|] |  ||  |~~~~|  || | [|] | ||
       || |_[|]_|  ||  | [] |  || |_[|]_| ||
       ||__________||  |   o|  ||_________||
     .'||][][][][][||  | [] |  ||[][][][][||.'.
    ."'||[][][][][]||_-`----'-_||][][][][]||"."
  .(')^(.)(').( )'^@/-- -- - --\@( )'( ).(( )^(.)^
 '( )^(`)'.(').( )@/-- -- - -- -\@ (.)'(.),( ).(').
 ".'.'." ." '.". @/- - --- -- - -\@ '.".'.".'.".'."
 ". '' ".".".'.'@/ - -- -- -- -- -\@".'..'".'."'.'.'
'.".".''.".''."@/ -- --- --- -- - -\@.".''.".''.".'".

*/

                                                                                                                                                                                                    
    private String name;
    private int money;
    private ArrayList<Property> properties;
    private int location;

    public Player(String name) {
        this.name = name;
        this.money = 1500;
        this.location = 0;
        this.properties = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<Property> getProperties() {
        return properties;
    }

    public int getLocation() {
        return location;
    }

    public void addMoney(int amount) {
        this.money += amount;
    }

    public void move(int steps) {
        System.out.println("Old location for " + name + " :" + location);
        int oldLocation = location;

        location += steps;
        location %= 40;
        System.out.println("New location for " + name + " :" + location);

        if (oldLocation > location || location == 0) {
            System.out.println(name + " passed / landed on GO. Collect $200.");
            money += 200;
        }
        if (location == 38) {
            System.out.println(name + " landed on Luxury Tax. Pay $100.");
            money -= 100;
        }
        if (location == 4) {
            System.out.println(name + " landed on Income Tax. Pay $200.");
            money -= 200;
        }
        if (location == 30) {
            System.out.println(name + " landed on Go to Jail. Moving to Jail.");
            location = 10;
        }
    }

    public static int rollDice() {
        int num1 = (int) (Math.random() * 6 + 1);
        int num2 = (int) (Math.random() * 6 + 1);
        System.out.println("Rolled: " + (num1 + num2));

        return num1 + num2;
    }

    public void buyProperty(int diceRoll) {
        Property temp = Board.propertiesMap.get(location);

        if (temp == null) {
            System.out.println("No property available to buy here.");
            return;
        }

        if (!temp.isPurchasable()) {
            System.out.println("This property cannot be purchased.");
            return;
        }

        if (temp.getOwner() != null && temp.getOwner() != this) {
            System.out.println("This property is already owned by " + temp.getOwner().getName());

            int rent;
            if (temp.isRailroad()) {
                int railroadsOwned = temp.getOwner().countRailroads();
                rent = 25 * (int) Math.pow(2, railroadsOwned - 1); 
            } else if (temp.isUtility()) {
                rent = diceRoll * (temp.getOwner().ownsBothUtilities() ? 10 : 4); 
            } else {
                boolean colorset = temp.getOwner().ownsAllInColor(temp.getColor());
                rent = temp.getRent(temp.getOwner(), temp.getNumHouses(), colorset);
            }

            if (money >= rent) {
                money -= rent;
                temp.getOwner().addMoney(rent);
                System.out.println(name + " paid $" + rent + " to " + temp.getOwner().getName());
            } else {
                System.out.println(name + " cannot afford rent and is bankrupt!");
            }
            return;
        }

        if (money >= temp.getPrice()) {
            money -= temp.getPrice();
            temp.setOwner(this);
            properties.add(temp);
            System.out.println(name + " bought " + temp.getName() + " for $" + temp.getPrice());
        } else {
            System.out.println(name + " does not have enough money to buy " + temp.getName());
        }
    }

    public int countRailroads() {
        int count = 0;
        for (Property prop : properties) {
            if (prop.isRailroad()) {
                count++;
            }
        }
        return count;
    }

    public boolean ownsBothUtilities() {
        int count = 0;
        for (Property prop : properties) {
            if (prop.isUtility()) {
                count++;
            }
        }
        return count == 2;
    }

    public boolean ownsAllInColor(Color color) {
        int count = 0;
        int totalInSet = Board.getTotalPropertiesInColorSet(color);

        for (Property prop : properties) {
            if (prop.getColor().equals(color)) {
                count++;
            }
        }
        return count == totalInSet;
    }
}