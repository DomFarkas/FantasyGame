/*
THIS IS THE CLASS THAT HANDLES FIGHTS.


*/



import java.util.Scanner;


class Fight{

    public Fight(){
    }

    public void fightsOn(Hero h1, Monster m1){
        Dice diceHero = new Dice (6);
        Dice diceMonster = new Dice (6);
        useSpecialPower(h1, m1);
        while(h1.health > 0 && m1.health > 0){
            rollDices(diceHero,  diceMonster);
            if(diceHero.random > diceMonster.random){
                heroAttack(h1, m1);
            }else if(diceHero.random < diceMonster.random){
                monsterAttack(h1, m1);
            }else{
                drawAttack(h1, m1);
            }

        }
        if (h1.health == 0) {
            System.out.println("The monster rips your body open! You die from your wounds.");
        } else {
            System.out.println("You lift your sword for a final blow! The monsters lies dead in front of you.");
        }

    }

    //Method to roll the dices of the Hero and Monster
    public void rollDices(Dice dice1, Dice dice2){
        Dice.randominator(dice1);
        Dice.randominator(dice2);
    }
    //Method in case Hero rolls bigger number
    public void heroAttack(Hero h1, Monster m1){
        m1.setHealth(m1.getHealth() - h1.getStrength());
        System.out.println("You land a massive strike on your enemy!");
        System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
    }

    //Method in case Monster rolls bigger number
    public void monsterAttack(Hero h1, Monster m1){
        h1.setHealth(h1.getHealth() - m1.getStrength());
        System.out.println("The monster jumps on you, clawing into your flesh!");
        System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
    }

    //Method in case Hero and Monster roll the same number
    public void drawAttack(Hero h1, Monster m1){
        System.out.println("You lunge towards your enemy, but it dodges your attack!");
        System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
    }

    //Method to ask if Hero wants to use special power
    public void useSpecialPower(Hero h1, Monster m1){
        System.out.println("\n" + "Do you want to use your special power? Enter Yes or No:");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine() != false){
            String answer;
            answer = scanner.nextLine();
            if(answer.compareTo("Yes") == 0){
                h1.specialPower(m1);
                break;
            } else if(answer.compareTo("No") == 0){
                System.out.println("You choose to save your powers for another fight!");
                break;
            } else {
                System.out.println("Invalid answer");
                break;
            }

        }


    }


}
