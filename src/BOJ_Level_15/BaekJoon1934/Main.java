package BOJ_Level_15.BaekJoon1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            System.out.println(A*B/gcd(A, B));
        }
    }
    public static int gcd(int N, int M) {
        while (M != 0) {
            int a = N;
            N = M;
            M = a % M;
        }
        return N;
    }
}