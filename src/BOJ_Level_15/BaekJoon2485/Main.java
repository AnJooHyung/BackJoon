package BOJ_Level_15.BaekJoon2485;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        // 2 6 12 18 -> 6-2 = 4, 12 - 6 = 6, 18 - 12 = 6 -> 이 3개의 최대 공약수는 2
        // 1 3 7 13 -> 3 - 1 = 2, 7 - 3 = 4, 13 - 7 = 6 -> 이 3개의 최대공약수는 2 -> 2/2 = 1-1 = 0, 4/2=2-1 = 1, 6/2=3-1=2 3개
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;

        for (int i = 0; i < N-1; i++) {
            int d = arr[i+1] - arr[i];
            gcd = gcd(d, gcd);
        }

        System.out.println((arr[N-1] - arr[0])/gcd - arr.length + 1);


    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int n = a;
            a = b;
            b = n % b;
        }
        return a;
    }
}
