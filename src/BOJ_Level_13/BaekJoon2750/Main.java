package BOJ_Level_13.BaekJoon2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();

        int[] a = new int[c];

        for (int i = 0; i < c; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.printf("%d\n", a[i]);
        }
    }
}
