package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10026 {

    static boolean[][] visited;
    static String[][] arr;

    static int t;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        arr = new String[t][t];

        for (int i = 0; i < t; i++) {

            String[] arr_color = br.readLine().split("");

            for (int j = 0; j < t; j++) {

                arr[i][j] = arr_color[j];
            }

        }

        int cnt = 0;

        visited = new boolean[t][t];

        for (int i = 0; i < t; i ++) {
            
            for (int j = 0; j < t; j++) {
                
                if (visited[i][j] == false ) {
                    
                    dfs(i, j);

                    cnt++;
                }
            }
        }


        int normal_cnt = cnt;
        cnt = 0;
        visited = new boolean[t][t];

        for (int i = 0; i < t; i ++) {

            for (int j = 0; j < t; j++) {

                if (arr[i][j].equals("G")) {

                    arr[i][j] = "R";
                }
            }
        }

        for (int i = 0; i < t; i ++) {

            for (int j = 0; j < t; j++) {

                if (visited[i][j] == false ) {

                    dfs(i, j);

                    cnt++;
                }
            }
        }

        System.out.println(normal_cnt + " " + cnt);


    }

    private static void dfs(int i, int j) {

        visited[i][j] = true;
        String s = arr[i][j];

        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};

        for (int a = 0; a < 4; a++) {

            int case_x = x[a] + i;
            int case_y = y[a] + j;

            if (case_x < 0 || case_x >= t || case_y < 0 || case_y >= t) {

                continue;
            }

            if (visited[case_x][case_y] == false && arr[case_x][case_y].equals(s)) {

                dfs(case_x, case_y);
            }
        }

    }
}
