package BOJ_Level_6.BackJoon10988;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int length = str.length();
        int a = length / 2;
        int err = 0;

        for (int i = 0; i < a; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                err++;
            }
        }
        if (err == 0) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
