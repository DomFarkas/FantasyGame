/**
 *
 * Description
 *
 * @version 1.0 from 2019. 09. 26.
 * @author
 */

public abstract class Item {

  // start attributes
  protected int weight;
  // end attributes

  public Item(int weight){
      this.weight = weight;
  }

  // start methods
  public int getWeight() {
    return weight;
  }

  // end methods
} // end of Item
