package BOJ_Level_2.Backjoon2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (B < 45) {
            if (A == 0) {
                A = 23;
                B += 15;
            }
            else {
                A -= 1;
                B += 15;
            }
        }
        else {
            B -= 45;
        }
        System.out.println(A + " " + B);
    }
}
