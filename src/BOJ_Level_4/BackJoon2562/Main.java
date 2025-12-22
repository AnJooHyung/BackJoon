package BOJ_Level_4.BackJoon2562;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 굳이 배열이 아니어도 풀 수 있는 문제 하지만 배열로 풀어봄
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int max;
        int maxindex;
//        for (int i = 0; i < 9; i++) {
//            int a =  sc.nextInt();
//            if (a > max) {
//                max = a;
//                maxindex = i + 1;
//            }
//        }
//        System.out.println(max);
//        System.out.println(maxindex);
        for (int i = 0; i < 9; i++) {
            int a = sc.nextInt();
            list.add(a);
        }
        max = Collections.max(list);
        maxindex = list.indexOf(max);
        System.out.println(max);
        System.out.println(maxindex + 1);

    }
}
