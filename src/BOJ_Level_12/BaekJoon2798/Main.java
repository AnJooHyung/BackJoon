package BOJ_Level_12.BaekJoon2798;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int result = search(arr, N, M);

        System.out.println(result);
    }
    static int search(int[] arr, int n, int m) {
        int result = 0;

        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];

                    if (temp == m) {
                        return temp;
                    }
                    if (result < temp && temp < m) {
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
