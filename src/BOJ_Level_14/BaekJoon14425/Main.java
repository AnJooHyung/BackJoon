package BOJ_Level_14.BaekJoon14425;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;
// 해쉬맵에 대해서 공부할 수 있었음
// Hashmap -> key와 value를 한쌍으로 갖고있는 집합, 추가/삭제/검색에 용이하다
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashMap<String,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(br.readLine(), 0);
        }

        int count = 0;

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                count++;
            }
        }
        System.out.println(count);
    }
}