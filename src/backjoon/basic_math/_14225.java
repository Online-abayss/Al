package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _14225 {

    static int t;
    static int[] map;
    static int idx;
    static boolean[] visited;
    static Set<Integer> sum_lst = new HashSet<>();

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        map = new int[t];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {

            map[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(map);

        visited = new boolean[100001];



        for (int i = 0; i < t; i ++) {

            int sum = 0;
            sum_lst.add(map[i]);
            if (!visited[map[i]]) {

                idx = i;
                dfs(map[i], 1, sum);
                visited[map[i]] = false;
            }
        }

        System.out.println(sum_lst);

        for (int i = 1; i < 100001; i++) {

            if (!sum_lst.contains(i)) {

                System.out.println(i);
                break;
            }
        }

    }

    private static void dfs(int now_number, int depth, int sum) {

        visited[now_number] = true;

        if (depth == t) {

            return;
        }

        for (int i = idx + 1; i < t; i++) {

            if (!visited[map[i]]) {

                sum = now_number + map[i];
                sum_lst.add(sum);
                dfs(map[i], depth + 1, sum);
                visited[map[i]] = false;
            }
        }





    }
}
