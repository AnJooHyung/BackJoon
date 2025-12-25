package BOJ_Level_5.BaekJoon1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = 0;

        if (str.charAt(0) != ' ') {
            sum += 1;
        }
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ' && str.charAt(i) != ' ' ) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}
