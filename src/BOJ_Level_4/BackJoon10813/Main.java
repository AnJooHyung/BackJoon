package BOJ_Level_4.BackJoon10813;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = i + 1;
        }
        int tmp;
        for (int i = 0; i < M; i++) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            tmp = list[b - 1];
            list[b - 1] = list[a - 1];
            list[a - 1] = tmp;
        }
        for (int i = 0; i < N; i++) {
            System.out.printf(list[i] + " ");
        }
    }
}
