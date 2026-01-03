package BOJ_Level_10.BaekJoon10101;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;

        if (sum == 180 && a == b && b == c) {
            System.out.println("Equilateral");
        }
        else if (sum == 180 && a == b && b !=c) {
            System.out.println("Isosceles");
        }
        else if (sum == 180 && a != b && a == c) {
            System.out.println("Isosceles");
        }
        else if (sum == 180 && a != c && b == c) {
            System.out.println("Isosceles");
        }
        else if (sum == 180 && a != b && b != c) {
            System.out.println("Scalene");
        }
        else if (sum != 180) {
            System.out.println("Error");
        }
    }
}
