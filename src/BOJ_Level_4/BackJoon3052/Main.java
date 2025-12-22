package BOJ_Level_4.BackJoon3052;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();
            list.add(a % 42);
        }

        int sum = 10;

        for (int i = 0; i < 10; i++) {
            int dif = 0;
            for (int j = i; j < 10; j++) {
                if (list.get(i) == list.get(j)) {
                    dif += 1;
                }
            }
            if (dif > 1) {
                sum -= 1;
            }
        }
        System.out.println(sum);
    }
}
