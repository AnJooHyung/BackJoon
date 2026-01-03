package BOJ_Level_10.BaekJoon9063;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int xmin = 10000;
        int xmax = -10000;
        int ymin = 10000;
        int ymax = -10000;

        for (int i = 0; i < n; i++) {
            int a  = sc.nextInt();
            int b = sc.nextInt();
            if (xmin > a) {
                xmin = a;
            }
            if (xmax < a) {
                xmax = a;
            }
            if (ymin > b) {
                ymin = b;
            }
            if (ymax < b) {
                ymax = b;
            }
        }
        if (n == 1) {
            System.out.println(0);
        }
        else {
            System.out.println((xmax - xmin) * (ymax - ymin));
        }
    }
}
