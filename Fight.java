class Fight{

    public Fight(){
    }

    public static void fightsOn(Hero h1, Monster m1){
        Dice diceHero = new Dice (6);
        Dice diceMonster = new Dice (6);

        while(h1.health > 0 && m1.health > 0){
            Dice.randominator(diceHero);
            Dice.randominator(diceMonster);
            if(diceHero.random > diceMonster.random){
                m1.setHealth(m1.getHealth() - h1.getStrength());
                System.out.println("You land a massive strike on your enemy!");
                System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
            }else if(diceHero.random < diceMonster.random){
                h1.setHealth(h1.getHealth() - m1.getStrength());
                System.out.println("The monster jumps on you, clawing into your flesh!");
                System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
            }else{
                System.out.println("You lunge towards your enemy, but it dodges your attack!");
                System.out.println("You have " + h1.health + " HP left, the Monster has " + m1.health + " HP left.");
            }
        }
    }

}
