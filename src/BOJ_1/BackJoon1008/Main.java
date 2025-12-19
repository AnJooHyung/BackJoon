package BOJ_1.BackJoon1008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
// 소수이므로 double or float 이때 float는 10^-9밖에 안되므로 double로
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
// println은 아주 작은값까지만 출력, 따라서 printf를 사용 -> "%.9f"와 같이 소수점을 나타낼 수 있음
        System.out.printf("%.9f", A/B);
    }
}
