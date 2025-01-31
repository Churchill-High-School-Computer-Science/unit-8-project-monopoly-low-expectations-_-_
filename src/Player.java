
import java.util.ArrayList;

















                                                                                                                                 /**/
                                                                                                                                /**/
                                                                                                                            /**/
                                                                                                            /**/
                                                                                                                      /**/
                                                                                                                              /**/
                                                                                                      /**/
                                                                                                  /**/
                                                                                                           /**/
                                                                                                          /**/
                                                                                                                     /**/
                                                                                                                /**/
                                                                                                                                            /**/
                                                                                                                                          /**/
                                                                                                                                        /**/
                                                                                                                                      /**/                                                                                                               public class Player {                                                                                            /**/
                                                                                                                                    /**/
                                                                                                                                  /**/
                                                                                                                                /**/
                                                                                                                              /**/
                                                                                                                            /**/
                                                                                                                          /**/
                                                                                                                        /**/
                                                                                                                      /**/
                                                                                                                    /**/
                                                                                                                  /**/
                                                                                                                /**/
                                                                                                              /**/
                                                                                                            /**/
                                                                                                          /**/
                                                                                                        /**/
                                                                                                      /**/
                                                                                                    /**/                                                                                                                                                                                                           /**/
                                                                                                  /**/
                                                                                                /**/
                                                                                              /**/
                                                                                            /**/
                                                                                          /**/
                                                                                        /**/
                                                                                      /**/
                                                                                    /**/
                                                                                  /**/
                                                                                /**/
                                                                              /**/
                                                                            /**/
                                                                          /**/
                                                                        /**/
                                                                      /**/
                                                                    /**/
                                                                  /**/                                                                                                                                                                                                        /**/
                                                                /**/









    private String name;
    private int money;
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
}
