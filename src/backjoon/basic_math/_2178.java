package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class _2178 {

    static int n;
    static int m;
    static boolean[][] visited;
    static int map[][];

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {

            char[] ch = br.readLine().toCharArray();

            for (int j = 0; j < ch.length; j++) {

                map[i][j] = ch[j] - '0';
            }
        }

        bfs(0,0);

        System.out.println(Arrays.deepToString(map));

        System.out.println(map[n-1][m-1]);

    }

    private static void bfs(int a, int b) {

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a,b});

        while (!q.isEmpty()) {

            int[] now = q.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {

                int x = nowX + dx[i];
                int y = nowY + dy[i];

                if (x < 0 || y < 0 || x >= n || y>= m || visited[x][y] || map[x][y] == 0) {

                    continue;
                }

                if (!visited[x][y] && map[x][y] == 1) {

                    q.add(new int[] {x, y});

                    visited[x][y] = true;

                    map[x][y] = map[nowX][nowY] + 1;
                }
            }

        }

    }

}
