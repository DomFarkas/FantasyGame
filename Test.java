import java.util.ArrayList;

class Test{

    public static void main(String[] args) {
        List l = new List();
        Weapon heroWeapon = new Weapon(10, "bronze", 1);
        Warrior w1 = new Warrior("Greg", 0, 0, 0, 0, heroWeapon, 0);
        Warrior w2 = new Warrior("Greg", 0, 0, 0, 0, heroWeapon, 0);
        Warrior w3 = new Warrior("Greg", 0, 0, 0, 0, heroWeapon, 0);
        Warrior w4 = new Warrior("Bob", 0, 0, 0, 0, heroWeapon, 0);
        Warrior w5 = new Warrior("Greg", 0, 0, 0, 0, heroWeapon, 0);
        Warrior w6 = new Warrior("Bob", 0, 0, 0, 0, heroWeapon, 0);

        l.append(w1);
        l.append(w2);
        l.append(w3);
        l.append(w4);
        l.append(w5);
        l.find();




    }
}
