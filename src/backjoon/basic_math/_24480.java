package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _24480 {

    static boolean[] visited;

    static ArrayList<ArrayList<Integer>> arr_lst = new ArrayList<>();

    static int dot;
    static int line;
    static int start;

    static int[] arr;

    static int cnt;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        dot = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(st.nextToken());

        for (int i = 0; i < dot + 1; i++) {

            arr_lst.add(new ArrayList<>());
        }

        for (int i = 0; i < line; i++) {

            StringTokenizer number_st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(number_st.nextToken());
            int v = Integer.parseInt(number_st.nextToken());

            arr_lst.get(u).add(v);
            arr_lst.get(v).add(u);
        }

        for (int i = 0; i < arr_lst.size(); i++) {

            Collections.sort(arr_lst.get(i), Collections.reverseOrder());
        }

        visited = new boolean[dot +1];

        arr = new int[dot + 1];

        cnt = 1;

        dfs(start);

        for (int i = 1; i < arr.length; i++) {

            System.out.println(arr[i]);
        }

    }

    private static void dfs(int start_num) {

        arr[start_num] = cnt;
        visited[start_num] = true;



        for (int i : arr_lst.get(start_num)) {

            if (!visited[i] && arr[i] == 0) {

                cnt ++;
                dfs(i);
            }
        }


    }
}
