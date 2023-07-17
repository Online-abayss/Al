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
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _1303 {

    static int n;
    static int m;
    static char[][] map;
    static boolean[][] visited;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    static int cnt;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new char[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            char[] char_text = br.readLine().toCharArray();

            for (int j = 0 ; j < m; j++) {

                map[i][j] = char_text[j];
            }
        }

        int w_sum = 0;
        int b_sum = 0;

        for (int i = 0 ; i < n; i++) {

            for (int j = 0; j < m; j++) {

                cnt = 1;

                if (!visited[i][j] && map[i][j] == 'W') {

                    bfs(i, j, 'W');
                    w_sum += cnt * cnt;

                }
                else if (!visited[i][j] && map[i][j] == 'B'){

                    bfs(i,j, 'B');
                    b_sum += cnt * cnt;
                }
            }
        }

        System.out.println(w_sum + " " + b_sum);

    }

    private static void bfs(int i, int j, char text) {

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{i,j});

        visited[i][j] = true;

        while (!q.isEmpty()) {

            int[] now = q.remove();

            for (int a = 0; a < 4; a++) {

                int x = dx[a] + now[0];
                int y= dy[a] + now[1];

                if (x<0 || y< 0 || x >= n || y >= m) {

                    continue;
                }

                if (!visited[x][y] && map[x][y] == text) {

                    cnt ++;
                    visited[x][y] = true;
                    q.add(new int[]{x,y});
                }

            }
        }


    }

}
