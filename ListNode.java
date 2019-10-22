/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.10.2019
 * @author
 */

public class ListNode {

  // Anfang Attribute
  private ListNode next;
  private ListNode previous;
  private Hero content;
  // Ende Attribute

  public ListNode(Hero content) {
    this.content = content;
    this.next = null;
  }

  // Anfang Methoden
  public ListNode getNext() {
    return next;
  }

  public Hero getContent() {
    return content;
  }

  public void setContent(Hero myHero){
      content = myHero;
  }

  public void setNext(ListNode nextNeu) {
    next = nextNeu;
  }

  public ListNode getPrevious() {
    return previous;
  }

  public void setPrevious(ListNode previousNeu) {
    previous = previousNeu;
  }

  // Ende Methoden
} // end of ListNode
