package BOJ_Level_14.BaekJoon10816;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] arr =  new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            int value = Integer.parseInt(st.nextToken());
            sb.append(upperbound(arr, value) - lowerbound(arr, value)).append(" ");
        }
        System.out.println(sb);
    }
    public static int lowerbound(int[] a, int value) {
        int lo = 0;
        int hi = a.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (value <= a[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
    public static int upperbound(int[] a, int value) {
        int lo = 0;
        int hi = a.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (value < a[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
