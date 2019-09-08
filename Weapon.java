import java.util.HashMap;

class Weapon{

    //Variables
    String material;
    int magic;
    int bonus;
    static HashMap<String, Integer> bonusMap = new HashMap<String, Integer>();

    //Constructor

    public Weapon(String material, int magic){
        this.material = material;
        this.magic = magic;
        bonusMap.put("bronze", 1);
        bonusMap.put("steel", 2);
        bonusMap.put("gold", 3);
        bonusMap.put("mythril", 5);
    }

    //get-/set-Methods
    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    public void setMagic(int magic){
        this.magic = magic;
    }

    public int getMagic(){
        return magic;
    }

    public void setBonus(int bonus){
        this.bonus = bonus;
    }

    public int getBonus(){
        this.bonus = bonusMap.get(this.material);
        return bonus;
    }
    //Methods







}
