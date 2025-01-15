package aulas.aula103_matrizes;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scan.nextInt();

        int[][] multidimensionalArray = new int[n][n];

        int negativeNumbers = 0;
        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int y = 0; y < multidimensionalArray.length; y++) {
                multidimensionalArray[i][y] = scan.nextInt();
                if (multidimensionalArray[i][y] < 0) {
                    negativeNumbers++;
                }
            }
        }

        System.out.println("Main diagonal:");
        for (int i = 0; i < multidimensionalArray.length; i++) {
            for (int y = 0; y < multidimensionalArray.length; y++) {
                if (i == y) {
                    System.out.print(multidimensionalArray[i][y] + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Negative numbers = " + negativeNumbers);

        scan.close();
    }
}