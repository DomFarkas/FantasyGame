class Warrior extends Hero{

    //Variables
    int endurance;


    //Constructor
    public Warrior(String name, int strength, int carry, int health, int xp, Weapon weapon, int endurance){
        super(name, strength, carry, health, xp, weapon);
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

    public void specialPower(Monster m){
        this.setStrength(this.getStrength() * 2);
        this.setEndurance(this.getEndurance() - 5);
        m.setStrength(m.getStrength() - 2);
        System.out.println(this.name + " has entered Berserk Mode! May God save our souls!");
    }
    public void eatFood(Warrior myWarrior, Food myFood){
        super.eatFood(myWarrior, myFood);
        myWarrior.setEndurance(myWarrior.getEndurance() + myFood.getEnduranceFactor());
    }

    public void putItemInbag(Backpack myBackpack, Item myItem){
        super.putItemInBag(myBackpack, myItem);
    }

}
