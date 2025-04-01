import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class Main {
    
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
    public static boolean search(TreeNode root, int key) {
        if (root == null) return false;
        if (root.val == key) return true;
        if(key < root.val) 
            return search(root.left, key);
        return search(root.right, key);
    }  
    public static int findmax(TreeNode root){
        if(root==null){
            return 0;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.val;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();           
        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }        
        int key = sc.nextInt();      
        System.out.println(search(root, key));
        System.out.println(findmax(root));
    
        
     
    }
}
