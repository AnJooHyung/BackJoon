package BOJ_Level_14.BaekJoon1764;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

/*HashSet을 이용해서 푸는 문제임
* HashSet이란 중복을 허용하지 않고, list처럼 순서가 존재하는 것이 아닌 비선형적 특성을 가짐
* 그래서 어느 틀정한 value의 값을 가지는 index를 알 수 없음
* 또한 null을 값으로 허용한다.
* 추가, 크기, 삭제, 검색, 출력 등을 지원한다.
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        HashSet<String> set1 = new HashSet<String>(n);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            set1.add(br.readLine());
        }
        // 따로 m이라는 크기의 HashSet을 만들필요 없이 그냥 입력을 받는대로 비교 후 list에 저장
        for (int i = 0; i < m; i++) {
            String a = br.readLine();
            if (set1.contains(a)) {
                list.add(a);
            }
        }
        Collections.sort(list);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
