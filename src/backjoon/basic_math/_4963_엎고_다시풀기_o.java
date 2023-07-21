package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _4963_엎고_다시풀기_o {

    static int w;
    static int h;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {0,0,-1,1,-1,1,-1,1};
    static int[] dy = {-1,1,0,0,1,1,-1,-1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (w == 0 || h == 0 ) {

                break;
            }

            map = new int[h][w];
            visited = new boolean[h][w];

            for (int i = 0; i < h; i++) {

                StringTokenizer islands_case = new StringTokenizer(br.readLine());

                for (int j = 0; j < w; j++) {

                    map[i][j] = Integer.parseInt(islands_case.nextToken());
                }

            }

            int cnt = 0;

            for (int i = 0; i < h; i++) {

                for (int j = 0; j < w; j++) {

                    if (!visited[i][j] && map[i][j] == 1)  {

                        dfs(i, j);
                        cnt += 1;


                    }
                }
            }

            System.out.println(cnt);
        }


    }

    private static void dfs(int a, int b) {

        visited[a][b] = true;

        for (int i = 0; i < 8; i++) {

            int x = dx[i] + a;
            int y = dy[i] + b;

            if (x < 0 || y < 0 || x >= h || y >= w) {

                continue;
            }

            if (!visited[x][y] && map[x][y] == 1 ) {

                dfs(x, y);
            }
        }

    }
}
