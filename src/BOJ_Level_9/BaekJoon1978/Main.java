package BOJ_Level_9.BaekJoon1978;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int a =  sc.nextInt();
            int count = 0;
            for (int j = 1; j <= a; j++) {
                if (a % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum++;
            }
        }
        System.out.printf("%d", sum);
    }
}
