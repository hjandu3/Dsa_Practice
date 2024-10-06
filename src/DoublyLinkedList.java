import java.util.LinkedList;

public class DoublyLinkedList {

    //1. Implement the doubly linked list with below features
//				1. Functions Created linked list will be 10->20->30->40
//            2. Function to insert a node at the beginning of the Doubly Linked List
//				3. Function to reverse a Doubly Linked List
//				4. Function to print nodes in a given doubly linked list

    Node head = null;
    Node tail = null;

    public void addNewNode(int data){
        Node  newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            head.previous = null;
            head.next = null;
        }else{
            head.next = newNode;
            //head.next
            newNode.previous = head;
            tail = newNode;
            tail.next = null;
        }

    }



}

class Node {

    int data;
    Node previous;
    Node next;

    public Node(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }



}
