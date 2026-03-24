package BOJ_Level_15.BaekJoon1735;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a3 =  Integer.parseInt(st.nextToken());
        int a4 =  Integer.parseInt(st.nextToken());

        int b = a1*a4 + a2*a3;
        int c = a2*a4;

        int mod = gcd(b, c); // 분모끼리 더 한것들의 분모/분자의 최대공약수로 나누면 됨
        // 따로따로 생각하면 복잡해져서 틀림.ㅊ
        b /= mod;
        c /= mod;

        System.out.printf("%d %d", b, c);
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
