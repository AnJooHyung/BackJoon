package BOJ_Level_4.BackJoon1546;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        double max = Collections.max(list);
        for (int i = 0; i < N; i++) {
            sum += list.get(i)/max*100;
        }
        System.out.printf("%.2f", sum/N);

    }
}
