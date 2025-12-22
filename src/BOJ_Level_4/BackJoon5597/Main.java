package BOJ_Level_4.BackJoon5597;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = new int[30];
        for (int i = 0; i < 30; i++) {
            list[i] = i + 1;
        }
        for (int i = 0; i < 28; i++) {
            int a = sc.nextInt();
            if (list[a - 1] == a) {
                list[a - 1] = 0;
            }
        }
        for (int i = 0; i < 30; i++) {
            if (list[i] != 0) {
                System.out.println(list[i]);
            }
        }
    }
}
