package BOJ_Level_9.BaekJoon5086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            }
            if (b % a == 0) {
                System.out.println("facter");
            }
            if (a % b == 0) {
                System.out.println("multiple");
            }
            if (a % b != 0 || b % a != 0) {
                System.out.println("neither");
            }
        }
    }
}
