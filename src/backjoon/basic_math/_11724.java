package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _11724 {

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> map_lst = new ArrayList<>();

    static int dot;
    static int line;
    static int cnt;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer dot_line_st = new StringTokenizer(br.readLine());

        dot = Integer.parseInt(dot_line_st.nextToken());
        line = Integer.parseInt(dot_line_st.nextToken());

        for (int i = 0; i < dot + 1; i++) {

            map_lst.add(new ArrayList<>());
        }

        visited = new boolean[dot + 1];

        for (int i = 0; i < line; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map_lst.get(a).add(b);
            map_lst.get(b).add(a);

        }

        for (int i = 1; i <= dot; i ++) {

            if (!visited[i]) {

                cnt++;
                dfs(i);
            }

        }

        System.out.println(cnt);


    }

    private static void dfs(int i) {

        visited[i] =true;

        for (int a : map_lst.get(i)) {

            if (!visited[a]) {

                visited[a] = true;
                dfs(a);

            }
        }

    }
}
