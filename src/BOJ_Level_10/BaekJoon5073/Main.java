package BOJ_Level_10.BaekJoon5073;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a+b+c;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            int max = Math.max(c, Math.max(a, b));
            if (sum - max <= max) {
                System.out.println("Invalid");
            }
            else {
                if (a == b && b == c) {
                    System.out.println("Equilateral");
                }
                else if ((a == b && b != c) || (a == c && b != c) || (a != c && b == c) ) {
                    System.out.println("Isosceles");
                }
                else if (a != b && b != c && c != a) {
                    System.out.println("Scalene");
                }
            }
        }
    }
}
