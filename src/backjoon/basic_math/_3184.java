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


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        weight = Integer.parseInt(st.nextToken());
        height = Integer.parseInt(st.nextToken());

        arr = new String[weight][height];

        for (int i = 0; i < weight; i++ ) {

            for (int j = 0; j < height; j++) {

                String[] arr_s =  br.readLine().split("");

                arr[i][j] = arr_s[j];
            }
        }

        visited = new boolean[weight][height];

        for (int i = 0; i < weight; i++) {

            for (int j = 0; j < height; j++) {

                if (!visited[i][j]) {

                    dfs(i, j,0,0);
                }
            }
        }



    }

    private static void dfs(int i, int j, int sheep_nums, int wolf_nums) {

        if (arr[i][j].equals("v")) {

            wolf_nums++;
        } else if (arr[i][j].equals("o")) {

            sheep_nums++;
        }

        sheep = sheep_nums;
        wolf = wolf_nums;

        visited[i][j] = true;

        int[] x = {0,0,-1,1};
        int[] y = {-1,1,0,0};

        for (int a = 0; a < 4; a ++) {

            int dx = i + x[i];
            int dy = j + y[i];

            if (dx < 0 || dy < 0 || dx >= weight || dy >= height) {

                continue;
            }

            if (!visited[dx][dy] && !arr[dx][dy].equals("#")) {

                dfs(dx,dy,sheep_nums, wolf_nums);
            }

        }
    }


}
