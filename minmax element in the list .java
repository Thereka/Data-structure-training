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
    public static void findMinMax(Node head) {
    if (head.next == null) { 
        System.out.println("List is empty.");
        return;
    }

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    Node temp = head.next; 

    while (temp != null) {
        if (temp.num < min) {
            min = temp.num;
        }
        if (temp.num > max) {
            max = temp.num;
        }
        temp = temp.next;
    }

    System.out.println("Minimum element: " + min);
    System.out.println("Maximum element: " + max);
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
        findMinMax(head);
   }
}
