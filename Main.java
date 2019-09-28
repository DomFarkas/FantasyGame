/*
THIS IS THE MAIN CLASS, THIS OPENS FIRST
WHEN THE CODE IS RUNNING.    
*/

import java.util.Scanner;

class Main{

    public static void main(String[] args) {
        Creation c = new Creation();
        Story s = new Story();
        Monster m = new Monster(10, 50);
        Fight f = new Fight();
        s.introduction();
        c.heroCreation();
        s.firstFight();
        f.fightsOn(c.player, m);
        if(c.player.getHealth() > 0){
            s.winFirstFight();
            if(c.heroClass.compareTo("Warrior") == 0){
                Apple a = new Apple();
                s.lootWarrior();
                Scanner answerScanner = new Scanner(System.in);
                while(answerScanner.hasNextInt() != false){
                    int answer;
                    answer = answerScanner.nextInt();
                    if(answer == 1){
                        c.player.eatFood(c.player, a);
                        System.out.println("You ate your apple! Your health increased by " + a.getHealingFactor() + " and your endurance by " + a.getEnduranceFactor() + ".");
                        break;
                    } else if(answer == 2){
                        c.player.putItemInBag(c.heroBackpack, a);
                        System.out.println("You choose to put your loot away.");
                        break;
                    }
                }
            } else {
                MagicMuffin mm = new MagicMuffin();
                s.lootWizard();
                Scanner answerScanner = new Scanner(System.in);
                while(answerScanner.hasNextInt() != false){
                    int answer;
                    answer = answerScanner.nextInt();
                    if(answer == 1){
                        c.player.eatFood(c.player, mm);
                        System.out.println("You ate your muffin! Your health increased by " + mm.getHealingFactor() + " and your mana by " + mm.getManaFactor() + ".");
                        break;
                    } else if(answer == 2){
                        c.player.putItemInBag(c.heroBackpack, mm);
                        System.out.println("You choose to put your loot away.");
                        break;
                    }
                }
            }

            s.theEnd();

        } else {

            s.loseFirstFight();
        }


    }

}
