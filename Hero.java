abstract public class Hero{

    //Variables
    String name;
    int strength;
    int health;
    int xp;
    Weapon weapon;

    //Constructor
    public Hero(String name, int strength, int health, int xp, Weapon weapon){
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.xp = xp;
        this.weapon = weapon;
    }

    public Hero(){

    }
    //get-/set-Methods
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setStrength(int strength){
        this.strength = strength;
    }

    public int getStrength(){
        return strength;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return health;
    }

    public void setXp(int xp){
        this.xp = xp;
    }

    public int getXp(){
        return xp;
    }

    //Methods

    public static void addWeaponBonus(Hero myHero){
        myHero.setStrength(myHero.getStrength() + myHero.weapon.getBonus());
    }

    public static void printHeroStats(Hero myHero){
        System.out.println(myHero.name + " " + myHero.strength + " " + myHero.health + " " + myHero.xp + " " + myHero.weapon.material + " " + myHero.weapon.magic);
    }
    public  static void lvlUp(Hero myHero){
        if(myHero.xp >= 25){
            myHero.setHealth(myHero.getHealth() + 10);
            myHero.setStrength(myHero.getStrength() + 10);
            myHero.setXp(0);
            System.out.println(myHero.name + " has just leveled up!");
        }else{
            System.out.println("Sorry, " + myHero.name + " isn't experienced enough to level up!");
        }
    }

}
