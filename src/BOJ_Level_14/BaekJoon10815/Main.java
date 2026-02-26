package BOJ_Level_14.BaekJoon10815;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

// 이분탐색을 이용한 풀이
// 이분탐색이란? M개의 확인에 대해서 N개의 숫자중 찾으라고 했을 때 N개의 숫자를 먼저 정렬해준 후,
// 그 N개의 값들의  M개의 숫자들이 크거나 작을 때 계속해서 갱신하면서 비교하는 방법
public class Main {
   public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       StringBuilder sb = new StringBuilder();

       int n = Integer.parseInt(br.readLine());
       int[] arr = new int[n];
       st = new StringTokenizer(br.readLine());

       for (int i = 0; i < n; i++) {
           arr[i] = Integer.parseInt(st.nextToken());
       }
       Arrays.sort(arr);

       int m =  Integer.parseInt(br.readLine());
       st = new StringTokenizer(br.readLine());

       for (int i = 0; i < m; i++) {
           int value = Integer.parseInt(st.nextToken());
           sb.append(search(arr,value)).append(" ");
       }
       System.out.println(sb);
   }
   public static int search(int[] a, int value) {
       int first = 0;
       int last = a.length;

       while (first < last) {
           int mid = (first+last)/2;
           if (a[mid] == value) {
               return 1;
           }
           if (a[mid] > value) {
               last = mid;
           }
           else {
               first = mid + 1;
           }
       }
       return 0;
   }
}
//        public static void main(String[] args) throws IOException {
//            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//            int n =  Integer.parseInt(br.readLine());
//            int[] arr1 = new int[n];
//            StringTokenizer st = new StringTokenizer(br.readLine());
//
//            for (int i = 0; i < n; i++) {
//                arr1[i] = Integer.parseInt(st.nextToken());
//            }
//            Arrays.sort(arr1);
//
//            int m = Integer.parseInt(br.readLine());
//            int[] arr2 = new int[n];
//            st = new StringTokenizer(br.readLine());
//
//            StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < m; i++) {
//                int tmp =  Integer.parseInt(st.nextToken());
//                sb.append(search(arr1, n, tmp) + " ");
//            }
//            bw.write(sb.toString());
//            bw.flush();
//            bw.close();
//        }
//
//        public static int search(int[] card, int n, int tmp) {
//            int first = 0;
//            int last = n - 1;
//            int mid = 0;
//
//            while (first <= last) {
//                mid = (first + last) / 2;
//                if (card[mid] == tmp) {
//                    return 1;
//                }
//                if (card[mid] < tmp) {
//                    first = mid + 1;
//                }
//                else  {
//                    last = mid - 1;
//                }
//            }
//
//            return 0;
//        }
