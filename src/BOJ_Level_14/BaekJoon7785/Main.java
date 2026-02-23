package BOJ_Level_14.BaekJoon7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;
// 해쉬맵을 이용한 풀이
// 해쉬맵으로 입력값을 받았을 때 정렬하는 법에 대해서 새롭게 알 수 있었음
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if (map.containsKey(name)) {
                map.remove(name);
            } else {
                map.put(name, status);
            }
        }
        // 리스트 형식으로 Hashmap에서 키값을 받아옴
        ArrayList<String> list = new ArrayList<String>(map.keySet());

        Collections.sort(list, (a, b) -> b.compareTo(a));
        for (String s : list) {
            System.out.println(s);
        }
    }
}