package BOJ_Level_5.BaekJoon5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' &&  str.charAt(i) <= 'C') {
                sum += 3;
            }
            else if (str.charAt(i) >= 'D' &&  str.charAt(i) <= 'F') {
                sum += 4;
            }
            else if (str.charAt(i) >= 'G' &&  str.charAt(i) <= 'I') {
                sum += 5;
            }
            else if  (str.charAt(i) >= 'J' &&  str.charAt(i) <= 'L') {
                sum += 6;
            }
            else if (str.charAt(i) >= 'M' &&  str.charAt(i) <= 'O') {
                sum += 7;
            }
            else if (str.charAt(i) >= 'P' &&  str.charAt(i) <= 'S') {
                sum += 8;
            }
            else if (str.charAt(i) >= 'T' &&  str.charAt(i) <= 'V') {
                sum += 9;
            }
            else if (str.charAt(i) >= 'W' &&  str.charAt(i) <= 'Z') {
                sum += 10;
            }
            else {
                sum += 0;
            }
        }
        System.out.println(sum );
    }
}
