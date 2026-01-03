package BOJ_Level_10.BaekJoon3009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[1000];
        int[] b = new int[1000];

        for (int i = 0; i < 3; i++) {
            int n =  sc.nextInt();
            int m = sc.nextInt();
            a[n-1]++;
            b[m-1]++;
        }

        int fa = 0;
        int fb=0;

        for (int i = 0; i < 1000; i++) {
            if (a[i] == 1) {
                fa = i;
            }
            if (b[i] == 1) {
                fb = i;
            }
        }
        System.out.printf("%d %d", fa + 1, fb + 1);




    }
}
