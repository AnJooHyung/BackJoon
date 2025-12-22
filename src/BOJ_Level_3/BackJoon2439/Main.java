package BOJ_Level_3.BackJoon2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = N; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.printf(" ");
            }
            for (int j = i; j <= N; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
}
