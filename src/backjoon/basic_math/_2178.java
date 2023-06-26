package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

                map[i][j] = ch[i] - '0';
            }
        }

        bfs(0,0);

    }

    private static void bfs(int a, int b) {

        visited[a][b] = true;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{a,b});

        while (!q.isEmpty()) {

            int[] now = q.poll();

        }

    }

}
