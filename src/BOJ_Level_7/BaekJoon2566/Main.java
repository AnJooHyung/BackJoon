package BOJ_Level_7.BaekJoon2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[9][9];
        int max = 0;
        int maxr = 0;
        int maxc = 0;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] > max) {
                    max = a[i][j];
                    maxr = i;
                    maxc = j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", maxr + 1, maxc + 1);


    }
}
