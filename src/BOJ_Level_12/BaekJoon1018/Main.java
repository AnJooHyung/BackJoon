package BOJ_Level_12.BaekJoon1018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static String[] white = {"WBWBWBWB", "BWBWBWBW"};
    static String[] black = {"BWBWBWBW", "WBWBWBWB"};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {
                int w = searchmin(arr, i, j, white);
                int b = searchmin(arr, i, j, black);

                min = Math.min(min, Math.min(w, b));
            }
        }
        System.out.println(min);

    }
    public static int searchmin(String[] arr, int n, int m, String[] color) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[n+i].charAt(j+m) != color[i%2].charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
