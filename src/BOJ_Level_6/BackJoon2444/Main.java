package BOJ_Level_6.BackJoon2444;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.printf("*");;
            }
            System.out.printf("\n");
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = n - i; j > 0; j--){
                System.out.printf(" ");
            }
            for (int j = 0; j < i * 2 -1; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
