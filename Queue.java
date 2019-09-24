public class Queue{
  // Anfang Attribute
  private Node head;
  private Node tail;
  // Ende Attribute

  public Queue() {
    this.head = null;
    this.tail = null;
  }

  // Anfang Methoden
  public Node getHead() {
    return head;
  }

  public Node getTail() {
    return tail;
  }

  public void setTail(Node tailNeu) {
    tail = tailNeu;
  }

  public void setHead(Node headNeu) {
    head = headNeu;
  }

  public void enqueue(Hero newHero) {
    Node newNode = new Node();
    newNode.setObjectContent(newHero);
    if(this.head == null) {
      this.setHead(newNode);
      this.setTail(newNode);
    } else {
      this.getTail().setNextNode(newNode);
      this.setTail(newNode);
    }

  }

  public Hero dequeue() {
    Hero myHero = this.head.getObjectContent();
    if(this.head.getNextNode() == null){
      this.setTail(null);
    }
    this.head = this.head.getNextNode();
    return myHero;
  }

  public boolean isEmpty(){
    if(this.head == null){
      return true;
    } else {
      return false;
    }
  }

  // Ende Methoden
}
