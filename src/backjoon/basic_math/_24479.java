package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _24479 {
    static boolean[] visited;

    static int dot;
    static int line;
    static int start;

    static ArrayList<ArrayList<Integer>> answer_lst = new ArrayList<>();


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        dot = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i < dot; i++) {

            answer_lst.add(new ArrayList<>());
        }


        for (int i = 0; i < line; i++) {

            StringTokenizer numbers_arr = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(numbers_arr.nextToken());
            int b = Integer.parseInt(numbers_arr.nextToken());

            answer_lst.get(a).add(b);
            answer_lst.get(b).add(a);
        }

        visited = new boolean[dot + 1];

        for (int i = 0; i < answer_lst.size(); i++) {

            Collections.sort(answer_lst.get(i));
        }

        dfs(start, start);



    }

    private static void dfs(int start, int now_number) {

        visited[start] = true;


        for (int i : answer_lst.get(start)) {

            if (!visited[i]) {

                dfs(i, start);
            }
        }

    }
}
