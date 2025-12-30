package BOJ_Level_8.BaekJoon2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] a = new int[N][4];
        int[] charge = {25, 10, 5, 1};

        for (int i = 0; i < N; i++) {
            int c = sc.nextInt();
            for (int j = 0; j < 4; j++) {
                a[i][j] = c / charge[j];
                c -=  a[i][j] * charge[j];
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
