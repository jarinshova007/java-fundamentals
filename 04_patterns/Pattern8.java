// print the pattern:
//     1       
//     2 3     
//     4 5 6      
//     7 8 9 10
//     11 12 13 14 15

import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("row = ");
        int row = sc.nextInt();

        int number = 1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number += 1;
            }
            System.out.println();
        }

    }
}
