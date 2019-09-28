/*
THIS IS A CLASS FOR THE LONG STORY ELEMENTS,
SO THEY DON'T TAKE TOO MUCH SPACE UP IN THE
MAIN CLASS.
*/



class Story{

    public void introduction(){
        System.out.println("Welcome stranger to the Plains of Vlohull!" + "\n" + "You will encounter horrors you could never imagine." + "\n" + "But first, let's create your hero!");
    }

    public void firstFight(){
        System.out.print("Uh oh! Looks like your first enemy is already here!" + "\n" + "Get ready, hero!");
    }

    public void winFirstFight(){
        System.out.println("Great job, hero! You killed your first monster!" + "\n" + "It had some loot, it's all yours!");
    }

    public void loseFirstFight(){
        System.out.println("Wow, that was fast. Rest in peace, hero..." + "\n" + "THE END");
    }

    public void lootWarrior(){
        System.out.println("You found an Apple!" + "\n" + "Press 1 to eat it or press 2 to put it in your backpack.");
    }

    public void lootWizard(){
        System.out.println("You found a Magic Muffin!" + "\n" + "Press 1 to eat it or press 2 to put it in your backpack.");
    }

    public void theEnd(){
        System.out.println("To be continued...");
    }

}
