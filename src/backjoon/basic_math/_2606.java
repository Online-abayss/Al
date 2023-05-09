package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _2606 {

    static int[][] arr;
    static boolean[] visited;

    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        arr = new int[N + 1][ N +1];

        for (int i = 0; i < M; i++) {

            String[] s_arr = br.readLine().split(" ");

            int a = Integer.parseInt(s_arr[0]);
            int b = Integer.parseInt(s_arr[1]);

            arr[a][b] = 1;
            arr[b][a] = 1;

        }

        visited = new boolean[N + 1];

        dfs(1);

        System.out.println(cnt -1);

    }



    private static void dfs(int i) {

        visited[i] = true;
        cnt ++;

        if (i > arr.length - 1) {

            return;
        }

        for (int node = 1; node < arr.length; node++) {

            if (arr[i][node] == 1 && visited[node] == false) {

                dfs(node);
            }
        }

    }
}
