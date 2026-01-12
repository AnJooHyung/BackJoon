package BOJ_Level_13.BaekJoon2587;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int avr = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            avr += arr[i];
        }
        avr /= 5;

        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(avr);
        System.out.println(arr[2]);
    }
}
