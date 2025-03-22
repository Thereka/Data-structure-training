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
    public static void printAlternate(Node head) {
    Node temp = head.next;
    boolean print = true; 
    System.out.print("Alternate elements: ");
    while (temp != null) {
        if (print) {
            System.out.print(temp.num + " ");
        }
        print = !print; 
        temp = temp.next;
    }
    System.out.println();
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
        printAlternate(head);
   }
}
