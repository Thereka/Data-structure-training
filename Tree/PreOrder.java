import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    Node root = null;

    void build() {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        if (data == -1) return;

        root = new Node(data);
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            Node currentNode = q.poll();

            int leftData = sc.nextInt();
            if (leftData != -1) {
                currentNode.left = new Node(leftData);
                q.offer(currentNode.left);
            }

            int rightData = sc.nextInt();
            if (rightData != -1) {
                currentNode.right = new Node(rightData);
                q.offer(currentNode.right);
            }
        }
        sc.close();
    }

    void PreOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.data + " "); 
        PreOrderTraversal(root.left); 
        PreOrderTraversal(root.right);
    }
}

public class Main{
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.build();
        tree.PreOrderTraversal(tree.root);  
    }
}
