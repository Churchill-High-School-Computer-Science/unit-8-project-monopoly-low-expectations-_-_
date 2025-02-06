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
    @SuppressWarnings("Convert2Diamond")
    ArrayList<Property> properties = new ArrayList<Property>();
    private int location;

    public Player(String n){
        name = n;
        money = 1500;
        location = 0;
    }

    public String getName(){
        return name;
    }

    public int getMoney(){
        return money;
    }

    public ArrayList<Property> getProperties(){
        return properties;
    }

    public int getLocation(){
        return location;
    }

    public void move(int steps){
        System.out.println("old location for " + name + " :" + location);
        int oldLocation = location;

        location += steps;
        location %= 40;
        System.out.println("new location for " + name + " :" + location);
        if(oldLocation > location || location == 0) {
            System.out.println(name + " passed / landed on go.  colect money. ");
            money +=200;
        }
        if(location == 38) {
            System.out.println(name + " landed on luxury tax.  pay 100");
            money -= 100;
        }
        if(location == 4) {
            System.out.println(name + " landed on income tax.  pay 200");
            money -= 200;
        }
        if(location == 30) {
            System.out.println(name + " landed on go to jail.  go to jail.");
            location = 10;
        }
    }
    
    public static int rollDice(){
        int num1 = (int)(Math.random() *6 +1);
        int num2 = (int)(Math.random() *6 +1);
        System.out.println("rolled " + (num1 + num2));

        return num1 + num2;
    }

    public void buyProperty(){
        Property temp = Board.propertiesMap.get(location); 

        if (temp == null) {
            System.out.println("No property available to buy here.");
            return; 
        }
        
        if (!temp.isPurchasable()) {
            System.out.println("This property cannot be purchased.");
            return; 
        }

        if (temp.getOwner() != null) {
            System.out.println("This property is already owned by " + temp.getOwner());
            return;
        }

        if (money >= temp.getPrice()) {
            money -= temp.getPrice();
            temp.setOwener(this);
            properties.add(temp);
            System.out.println(name + " bought " + temp.getName() + " for $" + temp.getPrice());
        } else {
            System.out.println(name + " does not have enough money to buy " + temp.getName());
        }

   
    }
}

    
