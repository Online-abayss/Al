package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _24479 {
    static boolean[] visited;
    static int[] arr;
    static int dot;
    static int line;
    static int start;

    static int cnt;
    static ArrayList<ArrayList<Integer>> answer_lst = new ArrayList<>();


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        dot = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i < dot + 1; i++) {

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

        cnt = 1;

        arr = new int[dot + 1];

        dfs(start);



        for (int i = 1; i < arr.length; i++) {

            System.out.println(arr[i]);
        }



    }

    private static void dfs(int start) {

        arr[start] = cnt;

        visited[start] = true;


        for (int i : answer_lst.get(start)) {

            if (!visited[i] && arr[i] == 0) {

                cnt++;
                dfs(i);
            }
        }

    }
}
