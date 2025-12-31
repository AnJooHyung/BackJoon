package BOJ_Level_8.BaekJoon2292;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();
        int sum = 1;
        int room = 0;
        while (sum <= N) {
            if (N == 1) {
                System.out.println(1);
                break;
            }
            if (sum < N && N <= 6*room+sum) {
                System.out.println(room+1);
                break;
            }
            else {
                sum = 6 * room + sum;
                room += 1;
            }
        }
    }
}
