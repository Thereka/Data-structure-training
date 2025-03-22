import java.util.*;
class Node{
    int num;
    Node next;
}
class Main{
    public static void insert(Node head){
        Node obj=new Node();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        obj.num=n;
        obj.next=head.next;
        head.next=obj;
    }
    public static void printNthElement(Node head, int n) {
    Node temp = head.next; 
    int count = 1; 

    while (temp != null) {
        if (count == n) {
            System.out.println("Element at position " + n + ": " + temp.num);
            return;
        }
        count++;
        temp = temp.next;
    }
    System.out.println("Position " + n+ " is out of range.");
}

    public static void display(Node head){
        Node t=head.next;
        while(t!=null){
            System.out.println(t.num);
            t=t.next;
        }
        

    }

    public static void main(String args[]){
        Node head=new Node();
        head.next=null;
        insert(head);
        insert(head);
        insert(head);
        insert(head);
        printNthElement(head, 3);
        display(head);
   }
}
