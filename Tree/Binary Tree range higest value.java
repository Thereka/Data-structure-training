import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Solution {
    
    public static TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    } 
    
    public static void printInRange(TreeNode root, int k1, int k2) {
        if (root == null) return;
        
        if (root.val > k1) {
            printInRange(root.left, k1, k2);
        }
        
        if (root.val >= k1 && root.val <= k2) {
            System.out.print(root.val + " ");
        }
        
        if (root.val < k2) {
            printInRange(root.right, k1, k2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();           
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        TreeNode root = null;
        
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }         
        
        printInRange(root, k1, k2);
        sc.close();
    }
}
