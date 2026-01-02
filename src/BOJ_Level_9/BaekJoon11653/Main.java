package BOJ_Level_9.BaekJoon11653;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        while (n != 1) {
            if (n % count == 0) {
                System.out.println(count);
                n /= count;
            }
            else {
                count++;
            }
        }
    }
}
