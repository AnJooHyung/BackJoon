package BOJ_Level_9.BeakJoon9506;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int sum = 1;
            if (n == -1) {
                break;
            }
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            if (sum == n) {
                System.out.printf("%d = %d ", n, 1);
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        System.out.printf("+ %d ", i);
                    }
                };
            }
            else {
                System.out.printf("%d is NOT perfect.", n);
            }
            System.out.printf("\n");
        }
    }
}
