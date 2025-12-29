package BOJ_Level_7.BaekJoon2563;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        char[][] str = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                str[i][j] = 'X';
            }
        }

        for (int i = 0; i < N; i++) {
            int a =  sc.nextInt();
            int b = sc.nextInt();
            for (int j = a; j < a + 10; j++) {
                for (int k = b; k < b + 10; k++) {
                    str[j][k] = 'O';
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (str[i][j] == 'O') {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
