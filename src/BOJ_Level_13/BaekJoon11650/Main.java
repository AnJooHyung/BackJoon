package BOJ_Level_13.BaekJoon11650;

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.Arrays;

    // 람다식을 이용한 풀이
    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];

            for (int i = 0; i < n; i++) {
                String[] str = br.readLine().split(" ");
                arr[i][0] = Integer.parseInt(str[0]);
                arr[i][1] = Integer.parseInt(str[1]);
            }

            Arrays.sort(arr, (o1, o2) -> {
                if (o1[0] == o2[0]) {
                    return o1[1] - o2[1]; // O1[1]이 크면 양수값으로 출력됨 만약 작으면 음수값이므로 O2[1]이 더 크다고 인식
                } else {
                    return o1[0] - o2[0];
                }
            });

            for (int i = 0; i < n; i++) {
                System.out.println(arr[i][0] + " " + arr[i][1]);
            }
        }
    }
