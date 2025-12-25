package BOJ_Level_5.BaekJoon2675;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 0; i < a; i++) {
            int b = Integer.parseInt(br.readLine());
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                System.out.printf("%s", str.charAt(j)*b);
            }
            System.out.printf("\n");
        }
    }
}
