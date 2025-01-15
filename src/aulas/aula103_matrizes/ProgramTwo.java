package aulas.aula103_matrizes;

import java.util.Scanner;

public class ProgramTwo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int y = scan.nextInt();
        int[][] matrix = new int[n][y];

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < y; x++) {
                matrix[i][x] = scan.nextInt();
            }
        }

        int numberOfMatrix = scan.nextInt();

        for (int i = 0; i < n; i++) {
            for (int x = 0; x < y; x++) {
                if (matrix[i][x] == numberOfMatrix) {
                    System.out.printf("Position %d,%d:%n", i, x);
                    if (x > 0) {
                        System.out.println("Left: " + matrix[i][x - 1]);
                    }
                    if (x < matrix[i].length - 1) {
                        System.out.println("Right: " + matrix[i][x + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][x]);
                    }
                    if (i < matrix.length - 1) {
                        System.out.println("Down: " + matrix[i + 1][x]);
                    }
                }
            }
        }

        scan.close();
    }
}