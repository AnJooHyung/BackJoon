package BOJ_Level_3.BackJoon10951;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String str;
        // 문제를 보면 반복문을 중단하는 조건이 없음
        // 그래서 만약 문자열을 입력받지 않는 것을 조건으로 함
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str, " "); // 입력받은 문자열을 토큰 단위로 쪼갬 1 2 -> 1과 2
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            bw.write(a + b + "\n");

        }
        bw.flush();
    }
}
