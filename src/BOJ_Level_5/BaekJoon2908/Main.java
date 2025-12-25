package BOJ_Level_5.BaekJoon2908;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int asum = (a % 10) * 100 + (a / 10) % 10 * 10 + a / 100;
        int bsum = (b % 10) * 100 + (b / 10) % 10 * 10 + b / 100;

        if (asum > bsum) {
            System.out.println(asum);
        }
        else{
            System.out.println(bsum);
        }
    }
}
