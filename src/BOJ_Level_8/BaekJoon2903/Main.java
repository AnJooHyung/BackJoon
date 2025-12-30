package BOJ_Level_8.BaekJoon2903;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 2;
        int a = 1;
        for (int i = 0; i < n; i++) {
            sum += a;
            a = a*2;
        }
        System.out.println(sum*sum);
    }
}