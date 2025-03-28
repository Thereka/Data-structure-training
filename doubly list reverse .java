import java.util.*;

class Node {
    int data;
    Node prev,next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
           newNode.prev=tail;
           tail.next=newNode;
           tail=newNode;
        }
    }

    void display() {
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
}
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while (true) {
            int val = sc.nextInt();
            if (val == -1) break; 
            list.insertAtEnd(val);
        }

        list.display(); 
        sc.close();
    }
}
