package BOJ_Level_7.BaekJoon10798;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] str = new String[5];
        int max = 0;
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
            if (str[i].length() > max) {
                max = str[i].length();
            }
        }
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < str.length; j++) {
                if (str[j].length() <= i) {
                    System.out.printf("");
                }
                else {
                    System.out.print(str[j].charAt(i));
                }
            }
        }
    }
}
