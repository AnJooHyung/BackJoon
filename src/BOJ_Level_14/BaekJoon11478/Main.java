package BOJ_Level_14.BaekJoon11478;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> set = new HashSet<String>();
        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
//                set에는 중복이 되지 않도록 설정이 되어있어서, 중복된 값이 들어오면 알아서 지워줌
//                이때 substring이라는 메서드를 사용해서, i~j-1까지의 문자열 값을 다 불러서 저장
                set.add(str.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}
