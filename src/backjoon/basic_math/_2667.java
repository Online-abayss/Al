package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class _2667 {

    static int cnt;
    static int[][] map;
    static boolean[][] visited;
    static int n;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        for (int i = 0; i < n; i++) {

            char[] char_arr = br.readLine().toCharArray();

            for (int j = 0; j < n; j++) {

                map[i][j] = char_arr[j] - '0';
            }

        }


        ArrayList<ArrayList<Integer>> cnt_lst = new ArrayList<>();

        for (int i = 0; i < n; i ++) {

            cnt_lst.add(new ArrayList<>());
        }

        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (!visited[i][j] ) {

                    dfs(i, j, map[i][j]);
                    cnt_lst.get(map[i][j]).add(cnt);
                    cnt = 0;
                }
            }
        }

        Collections.sort(cnt_lst.get(1));

        System.out.println(cnt_lst.get(1).size());

        for (int i = 0; i < cnt_lst.get(1).size(); i++) {

            System.out.println(cnt_lst.get(1).get(i));
        }





    }

    private static void dfs(int i, int j, int now_pos) {

        visited[i][j] = true;
        cnt ++;

        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};

        for (int a = 0; a < 4; a++) {

            int dx = x[a] + i;
            int dy = y[a] + j;

            if (dx < 0 || dy < 0 || dx >= n || dy >= n) {

                continue;
            }

            if (!visited[dx][dy] && map[dx][dy] == now_pos) {

                dfs(dx, dy ,now_pos);
            }
        }
    }

}
