////package backjoon.basic_math;
////
////import java.io.BufferedReader;
////import java.io.IOException;
////import java.io.InputStreamReader;
////import java.util.LinkedList;
////import java.util.Queue;
////import java.util.StringTokenizer;
////
////public class _1697_다시풀어보기_o {
////
////    static int n;
////    static int m;
////
////    static int[] visited = new int[100001];
////
////
////    public static void main(String[] args) throws IOException {
////
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////
////        StringTokenizer st = new StringTokenizer(br.readLine());
////
////        n = Integer.parseInt(st.nextToken());
////        m = Integer.parseInt(st.nextToken());
////
////        int result = bfs(n);
////
////        System.out.println(result);
////
////    }
////
////    private static int bfs(int n) {
////
////        Queue<Integer> q = new LinkedList<>();
////
////        q.add(n);
////        int idx = n;
////        int now_number = 0;
////        visited[idx] = 1;
////        while (!q.isEmpty()) {
////
////            now_number = q.remove();
////
////            if (now_number == m) {
////
////                return visited[now_number] - 1;
////            }
////            if (now_number -1 >= 0 && visited[now_number -1] == 0) {
////
////                visited[now_number - 1] = visited[now_number] + 1;
////                q.add(now_number -1);
////            }
////            if (now_number + 1 <= 100000 && visited[now_number + 1] == 0) {
////
////                visited[now_number + 1] = visited[now_number] + 1;
////                q.add(now_number + 1);
////            }
////            if (now_number * 2 <= 100000 && visited[2 * now_number] == 0) {
////
////                visited[now_number * 2] = visited[now_number] + 1;
////                q.add(now_number * 2);
////            }
////        }
////        return -1;
////    }
////
////}
//
//
//package backjoon.basic_math;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.StringTokenizer;
//
//public class _1697_다시풀어보기_o {
//
//    static int n;
//    static int k;
//    static Queue<Integer> q = new LinkedList<>();
//    static int[] visited;
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        n = Integer.parseInt(st.nextToken());
//        k = Integer.parseInt(st.nextToken());
//
//        visited = new int[100001];
//
//        int result = bfs(n);
//
//        System.out.println(result);
//
//
//
//    }
//
//    private static int bfs(int a) {
//
//        q.add(a);
//        visited[a] = 1;
//        int number = 0;
//
//
//        while (!q.isEmpty()) {
//
//            number = q.remove();
//
//            if (number == k) {
//
//                return visited[number] - 1;
//            }
//
//            if (number - 1 >= 0 && visited[number -1] == 0) {
//
//                visited[number - 1] = visited[number] + 1;
//                q.add(number - 1);
//            }
//            if (number + 1 <= 100000 && visited[number + 1] == 0) {
//
//                visited[number + 1] = visited[number] + 1;
//                q.add(number + 1);
//            }
//            if (number * 2 <= 100000 && visited[number * 2] == 0) {
//
//                visited[number * 2] = visited[number] + 1;
//                q.add(number * 2);
//            }
//
//        }
//        return -1;
//
//    }
//}


package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1697_다시풀어보기_o {

    static int[] map;
    static int start;
    static int end;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        map = new int[100001];

        bfs(start, end);
    }

    private static void bfs(int start, int end) {

        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        map[start] = 1;

        while (!q.isEmpty()) {

            int now_number = q.remove();

            if (now_number == end) {

                System.out.println(map[now_number] -1);
                break;
            }

            if (now_number -1 >= 0 && map[now_number -1] == 0 ) {

                map[now_number -1] = map[now_number] + 1;
                q.add(now_number -1);
            }
            if (now_number + 1 <= 100000 && map[now_number + 1] == 0 ) {

                map[now_number + 1] = map[now_number] + 1;
                q.add(now_number +1);
            }
            if (now_number * 2 <= 100000 && map[now_number * 2] == 0) {

                map[now_number * 2] = map[now_number] + 1;
                q.add(now_number *2);
            }
            // 처음알게 된 사실 어찌보면 당연했음. 코드는 앞에서부터 하나씩 순서대로 하기에, map[now_number * 2] 가 크기보다 크면 오류뜨는게,
            //  &&로 인해 저거먼저 자연스럽게 해서 안나오겠지 라는 멍청한 생각... 저게 걱정됬으면, now_number * 2를 앞에다 둬서 먼저 배열 크기 넘기는걸 방지해야했다.

        }
    }
}
