package BOJ_Level_4.BackJoon10818;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        int min = 1000000;
        int max = -1000000;
        for (int i = 0; i < N; i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println(min + " " + max);
    }
}
