package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class _7576 {

    static int m;
    static int n;

    static int cnt;
    static int[][] map;

    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};

    static Queue<int[]> q = new LinkedList<>();


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer m_n_st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(m_n_st.nextToken());
        n = Integer.parseInt(m_n_st.nextToken());

        map = new int[n][m];

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {

                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 1) {

                    q.add(new int[]{ i, j});
                }
            }
        }

        System.out.println(bfs());

    }

    private static int bfs() {

        while (!q.isEmpty()) {

            int[] now = q.poll();

            for (int i = 0; i < 4; i++) {

                int x = dx[i] + now[0];
                int y = dy[i] + now[1];

                if (x < 0 || y < 0 || x >= n || y >= m) {

                    continue;
                }

                if (map[x][y] == 0) {

                    q.add(new int[] {x,y});

                    map[x][y] = map[now[0]][now[1]] + 1;
                }
            }
        }

        int result = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (map[i][j] == 0) {

                    return -1;
                }

                result = Math.max(result, map[i][j]);
            }
        }

        if (result == 1) {
            return 0;
        } else {

            return result -1;
        }

    }

}
