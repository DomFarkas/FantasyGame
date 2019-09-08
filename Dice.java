class Dice{

    //Variables
    int max;
    int min = 1;
    int range = max - min + 1;
    int random;

    //Constructor
    public Dice(int max){
        this.max = max;
    }

    //get-/set-Methods
    public void setMax(int max){
        this.max = max;
    }

    public int getMax(){
        return max;
    }

    public void setRandom(int random){
        this.random = random;
    }

    public int getRandom(){
        return random;
    }

    //Methods
    public static int randominator(Dice myDice){
        if(myDice.max != 6 && myDice.max != 10){
            myDice.setMax(0);
            System.out.println("False amount of sides. Please enter 6 or 10.");
            return myDice.random;
        }else{
            myDice.random = (int)(Math.random() * myDice.max) + myDice.min;
            return myDice.random;
        }
    }

}
