import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public int pop() {
        if (top == null) {
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        size--;
        return poppedValue;
    }

    public int top() {
        return (top == null) ? -1 : top.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        Stack stack = new Stack();

        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            if (query == 1) {
                int value = sc.nextInt();
                stack.push(value);
            } else if (query == 2) {
                System.out.println(stack.pop());
            } else if (query == 3) {
                System.out.println(stack.top());
            } else if (query == 4) {
                System.out.println(stack.size());
            } else if (query == 5) {
                System.out.println(stack.isEmpty());
            }
        }
        sc.close();
    }
}
