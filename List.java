import java.util.Scanner;


/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 21.10.2019
 * @author
 */

public class List {

  // Anfang Attribute
  private ListNode first;
  private ListNode last;
  private ListNode current;
  // Ende Attribute

  // Anfang Methoden
  private boolean isEmpty(){
    if (this.getFirst() == null) {
      return true;
    } else {
      return false;
    }
  }

  private boolean hasAccess(){
    if (this.getCurrent() == null) {
      return false;
    } else {
      return true;
    }
  }

  private void next(){
    if (this.getCurrent() == null) {
      this.setCurrent(this.getFirst());
    } else {
      this.setCurrent(this.current.getNext());
    } // end of if-else
  }

  private void toFirst(){
    this.setCurrent(this.getFirst());
  }

  private void toLast(){
    this.setCurrent(this.getLast());
  }

  public void append(Hero h){
    ListNode appendedNode = new ListNode(h);
    if (this.getFirst() == null) {
      this.setFirst(appendedNode);
      this.setCurrent(this.getFirst());
      this.setLast(appendedNode);
    } else {
      this.last.setNext(appendedNode);
      this.setLast(appendedNode);
    } // end of if-else
  }

  private void insert(Hero h){
    if (this.getCurrent() == null) {
      this.append(h);
    } else {
      ListNode insertedNode = new ListNode(h);
      this.current.getPrevious().setNext(insertedNode);
      insertedNode.setPrevious(this.current.getPrevious());
      insertedNode.setNext(this.current);
      this.current.setPrevious(insertedNode);
    } // end of if-else
  }

  public void find(){
    Scanner nameScanner = new Scanner(System.in);
    System.out.println("Who are you looking for?");
    String nameAnswer = nameScanner.nextLine();
    while(this.checkName(nameAnswer) != true) {
        this.setCurrent(this.current.getNext());
        if(this.current == this.last){
            System.out.println("Sorry, they're not here!");
            break;
        }
    }
    System.out.println("Found Him!");
  }

  private boolean checkName(String name){
      if (this.current.getContent().getName().compareTo(name) == 0) {
          return true;
      } else {
          return false;
      }
  }



  public ListNode getFirst() {
    return first;
  }

  public ListNode getLast() {
    return last;
  }

  public ListNode getCurrent() {
    return current;
  }

  public void setFirst(ListNode firstNeu) {
    first = firstNeu;
  }

  public void setLast(ListNode lastNeu) {
    last = lastNeu;
  }

  public void setCurrent(ListNode currentNeu) {
    current = currentNeu;
  }

    // Ende Methoden
} // end of List
