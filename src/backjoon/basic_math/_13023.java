package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _13023 {

    static int dot;
    static int line;

    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> map_lst = new ArrayList<>();

    static int end;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer dot_line_st = new StringTokenizer(br.readLine());

        dot = Integer.parseInt(dot_line_st.nextToken());
        line = Integer.parseInt(dot_line_st.nextToken());

        for (int i = 0; i < dot; i++) {

            map_lst.add(new ArrayList<>());
        }

        for (int i = 0; i < line; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map_lst.get(a).add(b);
            map_lst.get(b).add(a);
        }

        visited = new boolean[dot];

        for (int i = 0; i < dot; i++ ) {

            visited[i] = true;
            dfs(i, 0);
            visited[i] = false;

            if (end == 1) {

                break;
            }
        }

        System.out.println(end);


    }

    private static void dfs(int i, int depth) {

        if (depth == 4) {
            end = 1;
            return;
        }

        for (int a : map_lst.get(i)) {

            if (!visited[a]) {

                visited[a] = true;
                dfs(a, depth + 1);
                visited[a] = false;
            }
        }
    }
}
