package BOJ_1.BackJoon10998;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) /* throws IOException */  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // IOException: Input/Ouput Exception, 입출력 예외로 메서드가 위험할 수 있으니, 사용하는 사람은 예외처리 해야함
        // 그래서 throws IOException은 예외 던지기(미루기)로 자바 가상머신에게 에러를 넘기는 것
        // try~catch는 try 시도해보고 error를 catch 했다면 다른 것으로 시도
        try {
            String[] str = br.readLine().split(" ");

            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            System.out.println(A*B);
        } catch (IOException e) {
            System.out.println("IO Error");
        }
    }
}
