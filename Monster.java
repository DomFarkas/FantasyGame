class Monster{

    //Variables

    int strength;
    int health;

    //Constructor

    public Monster(int strength, int health){
        this.strength = strength;
        this.health = health;
    }


    //get-/set-Methods

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

}
