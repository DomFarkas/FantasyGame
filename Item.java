/*
THIS IS A CLASS FOR ALL THE ITEMS THAT CAN BE
PUT INTO A BACKPACK
I.E. FOOD, WEAPONS
*/

public abstract class Item {

  // start attributes
  protected int weight;
  // end attributes

  public Item(int weight){
      this.weight = weight;
  }

  public Item(){

  }

  // start methods
  public int getWeight() {
    return weight;
  }

  // end methods
} // end of Item
