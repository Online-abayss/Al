package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2644 {

    static boolean[] visited;

    static int count = -1;

    static ArrayList<ArrayList<Integer>> human_lst = new ArrayList<>();


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int limit_human_nums = Integer.parseInt(br.readLine());

        String[] quest_arr = br.readLine().split(" ");

        int quest_a = Integer.parseInt(quest_arr[0]);
        int quest_b = Integer.parseInt(quest_arr[1]);

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < limit_human_nums + 1; i++) {

            human_lst.add(new ArrayList<>());
        }

        for (int i = 0; i < t; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int first_num = Integer.parseInt(st.nextToken());
            int second_num = Integer.parseInt(st.nextToken());

            human_lst.get(first_num).add(second_num);
            human_lst.get(second_num).add(first_num);
        }

        visited = new boolean[limit_human_nums + 1];

        dfs(quest_a, quest_b, 0);

        System.out.println(count);
    }



    private static void dfs(int start, int end, int cnt) {

        if (start == end) {

            count = cnt;
            return;
        }

        visited[start] = true;

        for (int i : human_lst.get(start)) {

            if (!visited[i]) {

                dfs(i, end, cnt + 1);
            }
        }

    }

}
