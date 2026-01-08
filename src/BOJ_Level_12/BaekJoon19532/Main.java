package BOJ_Level_12.BaekJoon19532;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();

        int x = 0;
        int y = 0;
        for (int i = -999; i <= 999; i++) {
            for (int j = -999; j <= 999; j++) {
                if (a*i + b*j == c && d*i + e*j == f) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.printf("%d %d", x, y);

//        double a =  sc.nextDouble();
//        double b = sc.nextDouble();
//        double c = sc.nextDouble();
//        double d = sc.nextDouble();
//        double e = sc.nextDouble();
//        double f = sc.nextDouble();
//        // ax + by = c
//        // dx + ey = f
//        int y = (int) ((c - (f * (a / d))) / (b - (e * (a / d))));
//        int x = (int) ((c - (b * y)) / a);
//
//        System.out.printf("%d %d", x, y);
    }
}
