package BOJ_Level_7.BaekJoon2738;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] a = new int[N][M];
        int[][] b = new int[N][M];
        int[][] sum = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                b[i][j] = sc.nextInt();
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        for  (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.printf("%d ", sum[i][j]);
            }
            System.out.printf("\n");

        }
    }
}
