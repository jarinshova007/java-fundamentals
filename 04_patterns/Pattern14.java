// print the hollow Butterfly:
//     *        *
//     **      **
//     * *    * *
//     *  *  *  *
//     *   **   *
//     *   **   *
//     *  *  *  *
//     * *    * *
//     **      **
//     *        *

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row: ");
        int row = sc.nextInt();

        // upper half
        for (int i = 1; i <= row; i++) {
            // upper left half
            for (int j = 1; j <= row; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // upper upper right half
            for (int j = 1; j <= row; j++) {
                if (j == row || (i + j) == row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower half
        for (int i = row; i >= 1; i--) {
            // lower left half
            for (int j = 1; j <= row; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            // lower upper right half
            for (int j = 1; j <= row; j++) {
                if (j == row || (i + j) == row + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();

    }
}
