package BOJ_Level_6.BaekJoon1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int[] arr = new int[26];
            String str = br.readLine();
            arr[str.charAt(0) - 'a']++;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j - 1)) {
                    if (arr[str.charAt(j) - 'a'] > 0) {
                        sum++;
                        break;
                    }
                    else {
                        arr[str.charAt(j) - 'a']++;
                    }
                }
                else {
                    arr[str.charAt(j) - 'a']++;
                }
            }
        }
        System.out.println(N-sum);
    }
}
