package BOJ_Level_13.BaekJoon2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// Arrays.sort는 퀵정렬 따라서 시간초과
// Collections.sort는 삽입정렬과 합병정렬을 합친거라 더 빠름
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i : list) {
            bw.write(i + " ");
        }
        bw.flush();
        bw.close();

    }
}
