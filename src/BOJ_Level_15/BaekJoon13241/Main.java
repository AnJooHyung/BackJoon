package BOJ_Level_15.BaekJoon13241;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str = new StringTokenizer(br.readLine());

        long a = Long.parseLong(str.nextToken());
        long b =  Long.parseLong(str.nextToken());
        System.out.println(a*b/search(a, b));

    }
    public static long search(long a, long b) {
        while (b != 0) {
            long n = a;
            a = b;
            b = n % b;
        }
        return a;
    }
}
