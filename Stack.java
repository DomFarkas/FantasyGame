public class Stack {

  // Anfang Attribute
  private WeaponNode head;
  // Ende Attribute

  // Anfang Methoden
  public WeaponNode getHead() {
    return head;
  }

  public void setHead(WeaponNode headNew) {
    head = headNew;
  }

  public void push(Weapon myWeapon) {
    WeaponNode newWeaponNode = new weaponNode();
    newWeaponNode.setContentObject(myWeapon);
    WeaponNode x = this.head;
    this.head = newWeaponNode;
    this.head.setNextNode(x);
  }

  public Weapon pop() {
    Weapon w = this.head.getContentObject();
    this.head = this.head.getNextNode();
    return w;
  }

  public boolean isEmpty(){
    if(this.head == null){
      return true;
    } else {
      return false;
    } // end of if-else
   }

  // Ende Methoden
} // end of Stack
