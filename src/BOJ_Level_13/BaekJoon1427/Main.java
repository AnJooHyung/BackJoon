package BOJ_Level_13.BaekJoon1427;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (n != 0) {
            list.add(n % 10);
            n /= 10;
        }

        Collections.sort(list);

        int count = list.size();

        for (int i = count -1; i >= 0; i--) {
            System.out.printf("%d", list.get(i));
        }
    }
}
