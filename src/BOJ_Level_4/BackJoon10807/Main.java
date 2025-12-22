package BOJ_Level_4.BackJoon10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i< N; i++) {
            int a = sc.nextInt();
            array[i] = a;
        }
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (array[i] == b) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
