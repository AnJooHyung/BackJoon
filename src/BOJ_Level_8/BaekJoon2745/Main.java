package BOJ_Level_8.BaekJoon2745;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();
        int[] sum = new int[N.length()];

        for (int i = 0; i < N.length(); i++) {
            int a = 1;
            for (int j = N.length() - i; j > 1; j--) {
                a = a * B;
            }
            sum[i] = a;
        }

        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) >= 'A' && N.charAt(i) <= 'Z') {
                sum[i] = sum[i] * (N.charAt(i) - 'A' + 10);
            }
            else if (N.charAt(i) >= '0' && N.charAt(i) <= '9') {
                sum[i] = sum[i] * (N.charAt(i) - '0');
            }
        }
        int result = 0;
        for (int i = 0; i < N.length(); i++) {
            result += sum[i];
        }
        System.out.println(result);
    }
}
