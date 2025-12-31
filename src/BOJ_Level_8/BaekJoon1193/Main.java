package BOJ_Level_8.BaekJoon1193;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 0;
        int i = 1;

        while (true) {
            if (sum < N && N <= sum + i) {
                if (i % 2 == 0) {
                    int p = i;
                    int z = 1;
                    for (int j = sum + 1; j < N;  j++){
                        p--;
                        z++;
                    }
                    System.out.printf("%d/%d", z, p);
                    break;
                }
                else {
                    int p = 1;
                    int z = i;
                    for (int j = sum + 1; j < N; j++) {
                        p++;
                        z--;
                    }
                    System.out.printf("%d/%d", z, p);
                    break;
                }
            }
            else {
                sum = sum + i;
                i++;
            }
        }
    }
}
