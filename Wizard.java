class Wizard extends Hero{

    //Variables
    int mana;

    //Constructor
    public Wizard(String name, int strength, int health, int xp, Weapon weapon, int magic){
        super(name, strength, health, xp, weapon);
        this.mana = mana;
    }

    //get-/set-Methods
    public void setMana(int xp){
        this.mana = mana;
    }

    public int getMana(){
        return mana;
    }

    //Methods
    public static void heal(Wizard myWizard){
        myWizard.setHealth(myWizard.getHealth() + 5);
        myWizard.setMana(myWizard.getMana() - 3);
        System.out.println(myWizard.name + " has healed itself!");
    }

    public static void healFriend(Wizard myWizard, Hero myFriend){
        myFriend.setHealth(myFriend.getHealth() + 5);
        myWizard.setMana(myWizard.getMana() - 3);
    }

}
