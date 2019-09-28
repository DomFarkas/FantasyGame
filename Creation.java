/*
THIS CLASS SERVES AS THE
HERO-CREATOR, THIS CLASS
LETS THE PLAYER ASSEMBLE HIS HERO.
*/


import java.util.Scanner;

class Creation{

    Hero player;
    String heroName;
    String heroClass;
    Weapon heroWeapon = new Weapon(10, "bronze", 1);
    Backpack heroBackpack = new Backpack(this.player);

    public void heroCreation(){
        System.out.println("Hello player! Create your hero! First give your hero a name:");
        Scanner nameScanner = new Scanner(System.in);
        this.heroName = nameScanner.nextLine();
        System.out.println("Now choose your class (Warrior/Wizard)");
        System.out.println("Warriors are more powerful and can become fearless murder-maschines." + "\n" + "Wizards might not be physically strong, but have mastered the ability to use the powers of the Forgotten Gods.");
        Scanner classScanner = new Scanner(System.in);
        while(classScanner.hasNextLine() != false){
            this.heroClass = classScanner.nextLine();
            if(heroClass.compareTo("Warrior") == 0){
                this.player = new Warrior(heroName, 30, 25, 100, 0, heroWeapon, 10);
                break;
            } else if(heroClass.compareTo("Wizard") == 0){
                this.player = new Wizard(heroName, 25, 25, 80, 0, heroWeapon, 12);
                break;
            }
        }
        System.out.println("You finally have a hero " + this.heroName + ". You are just a noob " + this.heroClass + " for now, but soon you'll be " + "\n" + "the most feared fighter the Plains have ever seen." + "\n" + "If you don't die, that is...");

    }

}
