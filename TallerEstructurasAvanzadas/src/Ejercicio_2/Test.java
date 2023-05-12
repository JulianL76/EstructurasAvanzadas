package Ejercicio_2;

import Ejercicio_2.BT_inOrder;
import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // Construir el árbol de ejemplo
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        // Crear una instancia de la clase BT_inOrder
        BT_inOrder bt = new BT_inOrder();

        // Llamar al método inorderTraversal para obtener la lista en orden
        List<Integer> inorderList = bt.inorderTraversal(root);

        // Imprimir la lista resultante
        System.out.println("Output: " + inorderList);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}