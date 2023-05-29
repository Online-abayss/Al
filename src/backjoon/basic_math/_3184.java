package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _3184 {

    static String[][] arr;
    static boolean[][] visited;

    static int weight;
    static int height;
    static int sheep;
    static int wolf;

    static int total_sheep;
    static int total_wolf;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        weight = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        arr = new String[weight][height];

        for (int i = 0; i < weight; i++ ) {

            String[] arr_s = br.readLine().split("");

            for (int j = 0; j < height; j++) {

                arr[i][j] = arr_s[j];
            }
        }
        visited = new boolean[weight][height];


        for (int i = 0; i < weight; i++) {

            for (int j = 0; j < height; j++) {
                wolf = 0;
                sheep = 0;

                if (!visited[i][j] && !arr[i][j].equals("#")) {

                    dfs(i, j);

                }
                if (sheep > wolf) {

                    wolf = 0;
                } else {

                    sheep = 0;
                }

                total_wolf += wolf;
                total_sheep += sheep;
            }

        }

        System.out.println(total_sheep + " " + total_wolf);

    }

    private static void dfs(int i, int j) {

        if (arr[i][j].equals("v")) {

            wolf += 1;
        } else if (arr[i][j].equals("o")) {

            sheep += 1;
        }

        visited[i][j] = true;


        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};

        for (int a = 0; a < 4; a ++) {

            int dx = i + x[a];
            int dy = j + y[a];

            if (dx < 0 || dy < 0 || dx >= weight || dy >= height) {

                continue;
            }

            if (!visited[dx][dy] && !arr[dx][dy].equals("#")) {

                dfs(dx,dy);
            }

        }
    }


}
