public class Node {

  // Anfang Attribute
  public Node nextNode;
  private Hero objectContent;
  // Ende Attribute

  // Anfang Methoden
  public Node getNextNode() {
    return nextNode;
  }

  public Hero getObjectContent() {
    return objectContent;
  }

  public void setNextNode(Node nextNodeNew) {
    nextNode = nextNodeNew;
  }

  public void setObjectContent(Hero objectContentNew) {
    objectContent = objectContentNew;
  }

  // Ende Methoden
} // end of Node
