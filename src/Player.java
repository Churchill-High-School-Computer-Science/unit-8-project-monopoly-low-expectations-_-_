import java.lang.Math;
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
         

         //Display.boardPanel.repaint();
         return location;
         

    }
    public void move(int steps){
        System.out.println("old location for " + name + " :" + location);

        location += steps;
        location %= 40;
        System.out.println("new location for " + name + " :" + location);
        //todo: what happens if you pass go?
    }
    
    public static int rollDice(){
        int num1 = (int)(Math.random() *6 +1);
        int num2 = (int)(Math.random() *6 +1);
        System.out.println("rolled" + (num1 + num2));

        return num1 + num2;
    }
}
