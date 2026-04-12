public class PracticeLL {
    Node head; // default null
    private int size;

    PracticeLL(){
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    // addLast 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        // System.out.println("running");
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode; 
  
    }

    // print list
    public void printList(){
        Node currNode = head;
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        while(currNode != null){
            System.out.print(currNode.data +" -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty list!!!");
            return;
        }
        size--;
        head = head.next;

    }
    public void deleteLast(){
        if(head == null){
            System.out.println("Empty list!!!");
            return;
        }
        size--;
        // If one node exists
        if(head.next ==null){
            head = null;
            return;
        }
        Node currNode = head;
        while(currNode.next.next != null){
            currNode = currNode.next;
        }
        currNode.next = null;
    } 

    public int getSize(){
        return size;
    }
    public void reverseIterate(){
        // Three pointers approach : prev, curr, next
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }


    public static void main(String[] args){
        PracticeLL list = new PracticeLL();

        list.addLast("1");    
        list.addLast("2");    
        list.addLast("3");    
        list.addLast("4");    

        list.printList();
        
        System.out.println(" ");

        // Reverse the Linked List (Recursive Approach)
        list.head = list.reverseRecursive(list.head);
        list.printList();            

        // Reverse the list Iterative approach
        // list.reverseIterate();
        // list.printList();



        // System.out.println("Original List:");
        // list.addLast("This");
        // list.addLast("is");
        // list.addLast("Sahil");
        
        // list.printList();


        // System.out.println("");
        // list.deleteFirst();
        // // After deletion
        // System.out.println("Deleting first element:");
        // list.printList();

        // System.out.println("");
        // list.deleteLast();
        // System.out.println("Deleting last element:");
        // list.printList();        


        // Size print
        // System.out.println("");
        // System.out.println("Size is: " +list.getSize());
    }
}
