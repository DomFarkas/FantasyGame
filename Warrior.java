class Warrior extends Hero{

    //Variables
    int endurance;


    //Constructor
    public Warrior(String name, int strength, int health, int xp, Weapon weapon, int endurance){
        super(name, strength, health, xp, weapon);
        this.endurance = endurance;
    }

    //get-/set-Methods
    public void setEndurance(int endurance){
        this.endurance = endurance;
    }

    public int getEndurance(){
        return endurance;
    }

    //Methods

    public static void berserkMode(Warrior myWarrior){
        myWarrior.setStrength(myWarrior.getStrength() * 2);
        System.out.println(myWarrior.name + " has entered Berserk Mode! May God save our souls!");
    }

}
