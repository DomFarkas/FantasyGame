import java.util.ArrayList;

class Party{

    //Variables
    String name;
    ArrayList<Hero>heroes = new ArrayList<Hero>();

    //Constructor
    public Party(String name){
        this.name = name;
    }

    public static void joinParty(Party myParty, Hero myHero){
        myParty.heroes.add(myHero);
    }

}
