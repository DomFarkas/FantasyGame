public class Main{
    public static void main(String[] args) {
        //Objects
        Wizard wizard1 = new Wizard("Greg", 8, 13, 25, new Weapon("mythril", 15), 25);
        Warrior warrior1 = new Warrior("Greta", 15, 20, 10, new Weapon("steel", 10), 15);
        Weapon weapon1 = new Weapon("mythril", 10);
        Monster monster1 = new Monster(10, 15);
        Dice dice1 = new Dice(10);
        Fight fight1 = new Fight();
        Party party1 = new Party("AlphaGang");

        //Running Program
        Party.joinParty(party1, wizard1);
        Party.joinParty(party1, warrior1);
        System.out.println(party1.heroes);


        /*
        Hero.printHeroStats(warrior1);
        Wizard.healFriend(wizard1, warrior1);
        Hero.addWeaponBonus(warrior1);
        Hero.printHeroStats(warrior1);
        Hero.printHeroStats(wizard1);
        Fight.fightsOn(warrior1, monster1);


        System.out.println(Dice.randominator(dice1));
        Hero.printHeroStats(warrior1);

        System.out.println(weapon1.bonusMap.get(weapon1.getMaterial()));

        System.out.println("The enemy has " + monster1.strength + " strength points and " + monster1.health + " health points!");

        Hero.printHeroStats(wizard1);
        Hero.lvlUp(wizard1);
        Wizard.heal(wizard1);
        Hero.printHeroStats(wizard1);

        Hero.printHeroStats(warrior1);
        Hero.lvlUp(warrior1);
        Warrior.berserkMode(warrior1);
        Hero.printHeroStats(warrior1);
*/

    }
    //Methods

}
