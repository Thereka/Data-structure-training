import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    private Node front, rear;
    private int size;

    public Queue() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }
        int val = front.data;
        front = front.next;
        if (front == null) { 
            rear = null;
        }
        size--;
        return val;
    }

    public int front() {
        return isEmpty() ? -1 : front.data;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(); 

        Queue queue = new Queue();

        for (int i = 0; i < q; i++) {
            int queryType = sc.nextInt();

            switch (queryType) {
                case 1: 
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2: 
                    System.out.println(queue.dequeue());
                    break;
                case 3: 
                    System.out.println(queue.front());
                    break;
                case 4: 
                    System.out.println(queue.getSize());
                    break;
                case 5: 
                    System.out.println(queue.isEmpty());
                    break;
            }
        }
        sc.close();
    }
}
