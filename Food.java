class Food extends Item{

    int healingFactor;
    int enduranceFactor;
    int manaFactor;

    public Food(int weight, int healingFactor, int enduranceFactor, int manaFactor){
        super(weight);
        this.healingFactor = healingFactor;
        this.enduranceFactor = enduranceFactor;
        this.manaFactor = manaFactor;
    }

    public Food(){
        
    }

    public void setHealingFactor(int healingFactor){
        this.healingFactor = healingFactor;
    }

    public int getHealingFactor(){
        return healingFactor;
    }

    public void setEnduranceFactor(int enduranceFactor){
        this.enduranceFactor = enduranceFactor;
    }

    public int getEnduranceFactor(){
        return enduranceFactor;
    }

    public void setManaFactor(int manaFactor){
        this.manaFactor = manaFactor;
    }

    public int getManaFactor(){
        return manaFactor;
    }

}
