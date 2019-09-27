public class BackpackNode {

  // Anfang Attribute
  private BackpackNode nextNode;
  private Item contentObject;
  // Ende Attribute

  // Anfang Methoden
  public BackpackNode getNextNode() {
    return nextNode;
  }

  public Item getContentObject() {
    return contentObject;
  }

  public void setContentObject(Item myContentObject) {
    contentObject = myContentObject;
  }

  public void setNextNode(BackpackNode myNextNode) {
    nextNode = myNextNode;
  }

  // Ende Methoden
} // end of BackpackNode
