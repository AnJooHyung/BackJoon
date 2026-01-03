package BOJ_Level_10.BaekJoon14215;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        if (a == b && b == c) {
            System.out.println(sum);
        }
        else {
            int max = Math.max(a, Math.max(b, c));
            sum -= max;

            if (sum > max) {
                sum += max;
                System.out.println(sum);
            }
            else {
                System.out.println(sum*2 - 1);
            }

        }
    }
}
