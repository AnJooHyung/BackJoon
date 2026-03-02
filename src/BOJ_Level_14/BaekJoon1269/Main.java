package BOJ_Level_14.BaekJoon1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        int sum = n+m;

        st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            map1.put(Integer.parseInt(st.nextToken()), 0);
        }
        st =  new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (map1.containsKey(a)) {
                map2.put(a, 1);
                map1.put(a, 1);
                sum -= 2;
            }
        }
        System.out.println(sum);
    }
}
