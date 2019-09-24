public class WeaponNode {

  // Anfang Attribute
  private weaponNode nextNode;
  private Weapon ContentObject;
  // Ende Attribute

  // Anfang Methoden
  public weaponNode getNextNode() {
    return nextNode;
  }

  public Weapon getContentObject() {
    return ContentObject;
  }

  public void setContentObject(Weapon ContentObjectNeu) {
    ContentObject = ContentObjectNeu;
  }

  public void setNextNode(weaponNode nextNodeNeu) {
    nextNode = nextNodeNeu;
  }

  // Ende Methoden
} // end of weaponNode
