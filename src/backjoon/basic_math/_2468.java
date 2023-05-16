package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2468 {

    static int[][] arr;
    static boolean[][] visited;

    static int t;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        arr = new int[t][t];

        int max_height = 0;

        for (int i = 0; i < t; i++ ){

            String[] case_arr = br.readLine().split(" ");
            for (int j = 0; j < t; j++) {

                arr[i][j] = Integer.parseInt(case_arr[j]);

                if (arr[i][j] > max_height) {

                    max_height = arr[i][j];
                }
            }
        }

        int max = 0;
        for (int i = 0; i < max_height + 1; i++) {

            visited = new boolean[t][t];
            int cnt = 0;

            for (int j = 0; j < t; j++) {

                for (int k = 0; k < t; k++) {

                    if (!visited[j][k] && arr[j][k] > i) {

                        dfs(j,k , i);

                        cnt ++;
                    }
                }
            }
            max = Math.max(max, cnt);

        }
        System.out.println(max);
    }

    private static void dfs(int x, int y, int height) {

        visited[x][y] = true;

        int[] arr_x = {0,0,-1,1};
        int[] arr_y = {-1,1,0,0};

        for (int i = 0; i < 4; i++) {

            int dx = arr_x[i] + x;
            int dy = arr_y[i] + y;

            if (dx < 0 || dy < 0 || dx > t-1 || dy > t-1) {

                continue;
            }

            if (visited[dx][dy] == false && arr[dx][dy] > height) {

                dfs(dx, dy, height);
            }
        }
    }
}
