package BOJ_Level_2.BackJoon2525;

import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        A += ((B + C) / 60);
        B = (B + C) % 60;
        if (A >= 24) {
            A -= 24;
        }
        System.out.println(A + " " + B);

    }
}