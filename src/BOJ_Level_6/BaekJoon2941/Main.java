package BOJ_Level_6.BaekJoon2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] c = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < c.length; i++) {
            int index = str.indexOf(c[i]);
            if (index >= 0) {
                str = str.replace(c[i], "1");
            }
        }
        System.out.println(str.length());
    }
}