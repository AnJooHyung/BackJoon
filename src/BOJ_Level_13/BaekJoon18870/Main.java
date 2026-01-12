package BOJ_Level_13.BaekJoon18870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

// HashMap에 대해서 알 수 있는 문제
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] origin = new int[n];
        int[] sorted = new int[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        String[] str = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            sorted[i] = origin[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(sorted);

        int rank = 0;
        for (int i : sorted) {
            if (!(map.containsKey(i))) {
                map.put(i, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key : origin) {
            int ranking = map.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}
