package BOJ_Level_10.BaekJoon1085;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int r = c -a;
        int l = d- b;

        int[] dist = {a, b, r, l};

        System.out.println(Arrays.stream(dist).min().getAsInt());
    }
}
