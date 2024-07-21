import java.util.*;
public class Linkedlist {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;


    public void addFirst(int data){
           // Craeate a new node
           Node newNode = new Node(data);
           if(head == null){
             head = tail = newNode;
             return;
           }
           // new node nex= head
           newNode.next = head;
           head = newNode;     
    }
    public void addLast(int data){
        Node 
    }

    public static void main(String args[]){
        Linkedlist ll = new Linkedlist();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println("hello");
        
    }
}
