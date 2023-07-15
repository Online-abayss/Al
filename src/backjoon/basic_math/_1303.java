//package backjoon.basic_math;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//    public class _1303 {
//
//    static String[][] arr;
//    static boolean[][] visited;
//
//    static int height;
//    static int weight;
//
//    static int blue;
//    static int white;
//
//    static int cnt_blue;
//    static int cnt_white;
//
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        weight = Integer.parseInt(st.nextToken());
//        height = Integer.parseInt(st.nextToken());
//
//        arr = new String[height][weight];
//
//        for (int i = 0; i < height; i++) {
//
//            String[] map_arr = br.readLine().split("");
//
//            for (int j = 0; j < weight; j++) {
//
//                arr[i][j] = map_arr[j];
//            }
//        }
//
//        visited = new boolean[height][weight];
//
//
//        for (int i = 0; i < height; i++) {
//
//            for (int j = 0; j < weight; j++) {
//
//                if (!visited[i][j]) {
//
//                    dfs(i, j, arr[i][j]);
//
//
//                    blue += (cnt_blue * cnt_blue);
//                    white += (cnt_white * cnt_white);
//
//                    cnt_blue = 0;
//                    cnt_white = 0;
//                }
//
//            }
//        }
//
//        System.out.println(white + " " + blue);
//
//
//    }
//
//    private static void dfs(int fx, int fy, String color) {
//
//        visited[fx][fy] = true;
//
//        if (arr[fx][fy].equals("W")) {
//
//            cnt_white ++;
//        } else {
//
//            cnt_blue ++;
//        }
//
//        int[] arr_x = {0,0,-1,1};
//        int[] arr_y = {-1,1,0,0};
//
//        for (int i = 0; i < 4; i++) {
//
//            int dx = arr_x[i] + fx;
//            int dy = arr_y[i] + fy;
//
//            if (dx < 0 || dy < 0 || dx >= height || dy >= weight) {
//
//                continue;
//            }
//
//            if (!visited[dx][dy] && arr[dx][dy].equals(color)) {
//
//                dfs(dx, dy, color);
//            }
//        }
//    }
//}


package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1303 {


}
