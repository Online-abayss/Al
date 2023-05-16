package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _4963_엎고_다시풀기 {

    static int[][] arr;
    static boolean[][] visited;
    static int cnt;

    static int a;
    static int b;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        a = 1;
        b = 1;

        while(true) {

            String[] a_b_case = br.readLine().split(" ");

            a = Integer.parseInt(a_b_case[0]);
            b = Integer.parseInt(a_b_case[1]);

            if (a == 0 && b == 0) {

                break;
            }

            arr = new int[b][a];

            for (int i = 0; i < b; i++) {

                String[] island_arr = br.readLine().split(" ");

                for (int j = 0; j < a; j++) {

                    arr[i][j] = Integer.parseInt(island_arr[j]);
                }
            }

            visited = new boolean[a][b];

            cnt = 0;

            for (int i = 0; i < b; i++) {

                for (int j = 0; j < a; j++) {

                    if (visited[i][j] == false && arr[i][j] == 1) {

                        dfs(i, j);

                        cnt++;
                    }
                }
            }

            System.out.println(cnt);
        }
    }

    private static void dfs(int i, int j) {

        visited[i][j] = true;

        int[] X = {0,0,1,-1,-1,1,-1,1};
        int[] Y = {1,-1,0,0,-1,1,1,-1};

        for (int z = 0; z < 8; z++) {

            int case_x = X[z] + i;
            int case_y = Y[z] + j;

            System.out.println("test x : " + case_x + " test y : " + case_y);

            if (case_x < 0 || case_y < 0 || case_x >= a || case_y >= b) {

                continue;
            }


            if (visited[case_x][case_y] == false && arr[case_x][case_y] == 1) {

                dfs(case_x, case_y);
            }

        }


    }
}
