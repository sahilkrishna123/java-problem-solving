import datastructures.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);

        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);
//        myLinkedList.removeLast();

      //  myLinkedList.prepend(7);
  //      myLinkedList.removeFirst();
//        myLinkedList.removeFirst();


        //myLinkedList.makeEmpty();

//        myLinkedList.set(1,4);
//        myLinkedList.insert(2,4);
        myLinkedList.remove(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

//        System.out.println(myLinkedList.get(1) +"\n");

    }
}