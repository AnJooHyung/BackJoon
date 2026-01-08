package BOJ_Level_12.BaekJoon2231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = search(n);

        System.out.println(result);

    }
    static int search(int n) {
        int result = 0;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            sum += i;
            int tmp = i;
            while (tmp > 0) {
                sum += tmp% 10;
                tmp = tmp/10;
            }
            if (sum == n) {
                result = i;
                break;
            }
        }
        return result;
    }
}
