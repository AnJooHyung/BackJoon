package BOJ_Level_6.BaekJoon1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                arr[str.charAt(i) - 'A'] += 1;
            }
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                arr[str.charAt(i) - 'a'] += 1;
            }
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int a = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                index = i;
                a++;
            }
        }

        if (a >= 2) {
            System.out.println("?");
        }
        else {
            System.out.println((char) (index+'A'));
        }
    }
}