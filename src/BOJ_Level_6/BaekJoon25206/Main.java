package BOJ_Level_6.BaekJoon25206;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        double count = 0;

        for (int i = 0; i < 20; i++) {
            String subject = sc.next();
            double a =  sc.nextDouble();
            String b = sc.next();

            if (b.equals("A+")) {
                sum += a * 4.5;
                count += a;
            }
            else if (b.equals("A0")) {
                sum += a * 4.0;
                count += a;
            }
            else if (b.equals("B+")) {
                sum += a * 3.5;
                count += a;
            }
            else if (b.equals("B0")) {
                sum += a * 3.0;
                count += a;
            }
            else if (b.equals("C+")) {
                sum += a * 2.5;
                count += a;
            }
            else if (b.equals("C0")) {
                sum += a * 2.0;
                count += a;
            }
            else if (b.equals("D+")) {
                sum += a * 1.5;
                count += a;
            }
            else if (b.equals("D0")) {
                sum += a * 1.0;
                count += a;
            }
            else if (b.equals("F")) {
                sum += a * 0.0;
                count += a;
            }
        }
        System.out.printf("%.4f", sum / count);
    }
}
