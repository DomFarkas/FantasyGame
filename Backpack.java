import java.util.ArrayList;

public class Backpack {

  private BackpackNode head;
  ArrayList<BackpackNode> amountOfNodes =  new ArrayList<BackpackNode>();
  private Hero owner;


  public Backpack(Hero owner){
      this.owner = owner;
  }

  public BackpackNode getHead() {
    return head;
  }

  public void setHead(BackpackNode myHead) {
    head = myHead;
  }

  public void push(Item myItem) {
          BackpackNode newBackpackNode = new BackpackNode();
          newBackpackNode.setContentObject(myItem);
          amountOfNodes.add(newBackpackNode);
          if(this.owner.getCarry() >= this.getWeight()){
          BackpackNode x = this.head;
          this.head = newBackpackNode;
          this.head.setNextNode(x);
      } else {
          amountOfNodes.remove(newBackpackNode);
          System.out.println("You can't carry any more items.");
      }
  }

  public Item pop() {
    amountOfNodes.remove(this.head);
    Item i = this.head.getContentObject();
    this.head = this.head.getNextNode();
    return i;
  }

  public boolean isEmpty(){
    if(this.head == null){
      return true;
    } else {
      return false;
    }
}

    public int getWeight(){
        int x = 0;
        for(BackpackNode i : amountOfNodes) {
            x = x + i.getContentObject().getWeight();
        }
        return x;

   }


  // Ende Methoden
} // end of Backpack
