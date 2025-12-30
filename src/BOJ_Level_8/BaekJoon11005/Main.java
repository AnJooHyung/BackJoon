package BOJ_Level_8.BaekJoon11005;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String str = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "";

        int n = sc.nextInt();
        int b = sc.nextInt();

        while (n != 0) {
            num += str.charAt(n % b);
            n = n / b;
        }
        for (int i = num.length() - 1; i >= 0; i--) {
            System.out.printf("%c", num.charAt(i));
        }
    }
}
