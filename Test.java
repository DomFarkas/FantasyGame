public class Test{
    public static void main(String[] args) {
        //Objects
        Weapon w1 = new Weapon(15, "gold", 3);
        Weapon w2 = new Weapon(100, "mythril", 6);
        Weapon w3 = new Weapon(3, "bronze", 1);
        Warrior wa1 = new Warrior("Greg", 10, 45, 10, 10, w3, 10);
        Backpack bp1 = new Backpack(wa1);

        //Running Program
        System.out.println(bp1.isEmpty());
        bp1.push(w1);
        bp1.push(w2);
        System.out.println(bp1.getWeight());
    }
    //Methods

}
