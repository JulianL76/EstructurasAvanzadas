package Ejercicio_1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class Test {
    public static void main(String[] args) {
        // Crear el árbol de prueba
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);

        // Crear una instancia de CBTInserter
        CBTInserter cbtInserter = new CBTInserter(root);

        // Solicitar los datos de entrada al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de operaciones: ");
        int numOperations = scanner.nextInt();

        int[] results = new int[numOperations];
        for (int i = 0; i < numOperations; i++) {
            System.out.print("Ingrese la operación " + (i + 1) + ": ");
            String operation = scanner.next();

            if (operation.equals("insert")) {
                int value = scanner.nextInt();
                results[i] = cbtInserter.insert(value);
            } else if (operation.equals("get_root")) {
                TreeNode rootAfterInsertion = cbtInserter.get_root();
                results[i] = rootAfterInsertion.val;
            } 
        }

        // Imprimir los resultados
        System.out.print("Output: [");
        for (int i = 0; i < numOperations; i++) {
            System.out.print(results[i]);
            if (i < numOperations - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}