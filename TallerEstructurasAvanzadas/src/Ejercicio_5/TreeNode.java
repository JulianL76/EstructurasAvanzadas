package Ejercicio_5;

import java.util.Stack;

public class TreeNode {
   
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }

    public TreeNode() {
    }

    @Override
    public String toString() {
        return "TreeNode{" + "val=" + val + ", left=" + left + ", right=" + right + '}';
    }
   
   public void insert1(TreeNode root, int key)
    {
        TreeNode newnode = new TreeNode(key);
        TreeNode x = root;
        TreeNode y = null;
 
        while (x != null) {
            y = x;
            if (key < x.val)
                x = x.left;
            else
                x = x.right;
        }
        if (y == null)
            y = newnode;
        else if (key < y.val)
            y.left = newnode;
        else
            y.right = newnode;
    }
   
   public static TreeNode insert(TreeNode root, int key)
    {
        if (root == null) {
            return new TreeNode(key);
        }

        if (key < root.val) {
            root.left = insert(root.left, key);
        }
        else {
        
            root.right = insert(root.right, key);
        }
 
        return root;
    }
   
   public void add(Integer value) {
    if (value < this.val) {
        if (left != null) {
            left.add(value);
        } else {
            left = new TreeNode(value);
        }
    } else {
        if (right != null) {
            right.add(value);
        } else {
            right = new TreeNode(value);
        }
    }
}

   
   public TreeNode make_tree(int v[]){
   TreeNode root = new TreeNode(v[0]);
   for(int i = 1; i<v.length; i++){
      insert(root,v[i]);
   }
   return root;
}}

