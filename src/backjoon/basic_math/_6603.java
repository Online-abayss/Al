package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _6603 {

    static int t;

    static int[] map;
    static boolean[] visited;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            t = Integer.parseInt(st.nextToken());

            if (t == 0) {

                break;
            }
            
            map = new int[t];
            visited = new boolean[t];
            
            for (int i = 0; i < t; i ++) {
                
                map[i] = Integer.parseInt(st.nextToken());
            }
            
            dfs(0,0);

            System.out.println();



        }
}

    private static void dfs(int start, int depth) {

        if (depth == 6) {

            for (int i = 0; i < t; i++) {

                if (visited[i]) {

                    System.out.print(map[i] + " ");
                }
            }
            System.out.println();
        }

        for (int i = start; i < t; i++) {

            visited[i] = true;
            dfs(i + 1, depth + 1);
            visited[i] = false;
        }
    }
    }
