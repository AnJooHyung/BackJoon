package BOJ_Level_11.BaekJoon24267;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long sum = 0;

        for (long i = n-2; i >= 1; i--) {
            sum += i * (n - i - 1);
        }

        System.out.println(sum);
        System.out.println(3);
    }
}
// (n-2 + n-3 ~1) + (n-3 ~ 1)
