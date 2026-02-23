package BOJ_Level_14.BaekJoon1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1 ; i <= n; i++) {
            String s =  br.readLine();
            map1.put(i, s);
            map2.put(s, i);
        }

        for (int i = 0; i < m; i++) {
            String s =  br.readLine();
            // 아스키 코드 값에 따라 맨앞자리로 숫자인지 따짐
            if (49 <= s.charAt(0) && s.charAt(0) <= 57) {
                System.out.println(map1.get(Integer.parseInt(s)));
            }
            else {
                System.out.println(map2.get(s));
            }
        }
    }
}
