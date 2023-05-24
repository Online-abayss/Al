package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1743 {

    static int[][] arr;
    static boolean[][] visited;

    static int n;
    static int m;

    static int cnt;
    static int count;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        arr = new int[m + 1][n + 1];

        for (int i = 0; i < k; i++) {

            StringTokenizer new_st = new StringTokenizer(br.readLine(), " ");

            int height = Integer.parseInt(new_st.nextToken());
            int weight = Integer.parseInt(new_st.nextToken());

            arr[weight][height] = 1;
        }

        visited = new boolean[m + 1][n + 1];

        for (int i = 1; i <= m; i++ ) {

            for (int j = 1; j <= n; j++) {

                if (!visited[i][j] && arr[i][j] == 1) {

                    count = 0;
                    dfs(i, j);
                    cnt = Math.max(count, cnt);
                }
            }
        }

        System.out.println(cnt);

    }

    private static void dfs(int i, int j) {

        visited[i][j] = true;
        count++;

        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};

        for (int t = 0 ; t < 4; t ++) {

            int dx = x[t] + i;
            int dy = y[t] + j;

            if (dx <= 0 || dy <= 0 || dx > m || dy > n) {

                continue;
            }

            if (!visited[dx][dy] && arr[dx][dy] == 1) {

                dfs(dx,dy);
            }
        }
    }
}

// dfs(dx ,dy, count)로 했을 경우 2방향 이상이 동시에 만족할 경우, 카운팅이 +1만 되서 문제가됨.
