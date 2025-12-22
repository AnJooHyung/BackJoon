package BOJ_Level_4.BackJoon10811;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =  sc.nextInt();
        int M = sc.nextInt();

        int[] list =  new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = i + 1;
        }

        int tmp;

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            while (a < b) {
                tmp = list[a];
                list[a] = list[b];
                list[b] = tmp;
                a++;
                b--;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
