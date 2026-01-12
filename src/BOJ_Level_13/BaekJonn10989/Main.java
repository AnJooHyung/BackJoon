package BOJ_Level_13.BaekJonn10989;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);

        for (int i = 0; i < n; i++) {
            bw.write(list[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
