package BOJ_Level_4.BackJoon10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 배열은 int[] 변수명 = new int[사이즈] 이런식으로 선언 가능
        // 하지만 ArrayList라는 List 인터페이스에서 상속받은 클래스를 사용 -> 동적으로 변환 가능
        // <> 사이에 String을 할 것인지 Integer로 할 것인지 결정
        // 하지만 일반적인 정적인 배열이 사용하는 함수랑 다르게 쓰임
        ArrayList<Integer> list = new ArrayList<>();

        int N = sc.nextInt();
        int X = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a =  sc.nextInt();
            if (a < X) {
                list.add(a);
            }
        }
        int listsize = list.size();
        for (int i = 0; i < listsize; i++) {
            System.out.printf(list.get(i) + " ");
        }
    }
}
