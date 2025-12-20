package BOJ_Level_1.BackJoon18108;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");

        int y = Integer.parseInt(st.nextToken());

        System.out.println(y - 543);
    }
}
