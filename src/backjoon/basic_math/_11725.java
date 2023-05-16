package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _11725 {

    static int[] arr_num;
    static boolean[] visited;
    static int t;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        arr_num = new int[t + 1];
        arr_num[0] = -1;

        for (int i = 0; i < t -1; i++) {

            String[] arr_s = br.readLine().split(" ");

            int a = Integer.parseInt(arr_s[0]);
            int b = Integer.parseInt(arr_s[1]);

            arr_num[b] = a;

        }

        visited = new boolean[t + 1];

        for (int i = 1; i < t + 1; i++) {

            if ((!visited[i] && arr_num[i] ==  2) || (!visited[i] && arr_num[2] != 0)) {

                dfs(i);

            }
        }

        System.out.println(Arrays.toString(arr_num));


    }

    private static void dfs(int i) {

        visited[i] = true;

        System.out.println(i);

        for (int j = 1; j < t + 1; j++) {

            if ((!visited[j] && arr_num[j] == arr_num[i] + 1) || (!visited[j] && arr_num[arr_num[i] + 1] != 0)) {

                dfs(j);
            }
        }
    }
}
