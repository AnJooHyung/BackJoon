package BOJ_Level_1.BackJoon2588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st1 = br.readLine();
        String[] st2 = br.readLine().split("");

        int sum = 0;
        int num = 1;
        for (int i = st2.length - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(st1)*Integer.parseInt(st2[i]));
            sum += Integer.parseInt(st1)*Integer.parseInt(st2[i])*num;
            num *= 10;
        }
        System.out.println(sum);
    }
}