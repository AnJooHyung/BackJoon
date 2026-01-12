package BOJ_Level_12.BaekJoon2839;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =  sc.nextInt();
        int sum = 0;
        int index = 0;
        while (true) {
            if (n % 5 == 0) {
                sum += n/ 5;
                break;
            }
            n -= 3;
            sum += 1;
            if (n < 0) {
                break;
            }
        }
        if (n < 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
        }

    }
}
