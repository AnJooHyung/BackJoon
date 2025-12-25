package BOJ_Level_5.BaekJoon10809;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            int b = sc.nextInt();
            String str = sc.nextLine().trim();

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < b; k++) {
                    System.out.printf("%c", str.charAt(j));
                }
            }
            System.out.printf("\n");
        }
    }
}
