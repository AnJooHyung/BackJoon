package BOJ_Level_2.BackJoon2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int sum = 0;

        if (A == B && B == C) {
            sum = 10000 + A * 1000;
        }
        else if (A == B && B != C) {
            sum = 1000 + A * 100;
        }
        else if (A == C && A != B) {
            sum = 1000 + A * 100;
        }
        else if (B == C && A != B) {
            sum = 1000 + B * 100;
        }
        else {
            sum = max(A, B, C) * 100;
        }
        System.out.println(sum);
    }
    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        }
        else if (b > a && b > c) {
            return b;
        }
        else{
            return c;
        }
    }
}
