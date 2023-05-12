package Ejercicio_2;

import java.util.*;
public class BT_inOrder {  // BinaryTree

    List<Integer> list = new ArrayList();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) {
            return new ArrayList();
        }

        this.inorderTraversal(root.left);
        list.add(root.val);
        this.inorderTraversal(root.right);

        return list;
    }
}
