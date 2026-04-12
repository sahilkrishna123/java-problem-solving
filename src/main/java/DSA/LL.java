import datastructures.linkedlist.LinkedList;

public class LL {
    public Node head;
    public Node tail;
    private int size;
    LL(){
      this.size =0;
    }
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {

            lastNode = lastNode.next; //lastNode = null at last value
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    public int getSize(){
        return size;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next ==null)
        {
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;

    }

    public static void main(String arg[]) {
        LL list = new LL();

        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");

        list.printList();

        list.head = list.reverseRecursive(list.head);

        list.printList();


        //list.addFirst("a");
        //list.addFirst("is");
        //list.printList();

        //list.addLast("list");
        //list.printList();

        //list.deleteFirst();
        //list.deleteLast();
        //list.printList();

        //System.out.println(list.getSize());
    }
}
