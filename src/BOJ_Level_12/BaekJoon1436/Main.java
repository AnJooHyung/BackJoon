package BOJ_Level_12.BaekJoon1436;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = 1;
        if (n == 1) {
            System.out.println(666);
        }
        else {
            for (long i = 667; ; i++) {
                long temp = i;
                int count = 0;
                while (temp != 0) {
                    if (temp % 1000 == 666) {
                        count = 1;
                    }
                    temp /= 10;
                }
                if (count == 1) {
                    result++;
                }
                if (result == n) {
                    System.out.println(i);
                    break;
                    }
            }

        }
    }
}