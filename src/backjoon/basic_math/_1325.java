package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1325 {

    static int[] arr;
    static boolean[] visited;

    static ArrayList<ArrayList<Integer>> computer_lst = new ArrayList<>();



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(tokenizer.nextToken());
        int b = Integer.parseInt(tokenizer.nextToken());

        for (int i = 0; i < a + 1; i++) {

            computer_lst.add(new ArrayList<>());
        }

        arr = new int[a + 1];

        for (int i = 0; i < b; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine()," ");

            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());

            computer_lst.get(com1).add(com2);
        }

        for (int i = 1; i <= a; i++) {

            visited = new boolean[a + 1];

            dfs(i);


        }

        int max = 0;

        for (int i = 1; i <= a; i++) {

            max = Math.max(max, arr[i]);
        }

        int num = 0;

        for (int i = 1; i <= a; i++) {

            if (max == arr[i]) {

                num = i;
            }
        }

        System.out.println(num + " " + max);

    }

    private static void dfs(int i) {

        visited[i] = true;

        for (int a : computer_lst.get(i)) {

            if (!visited[a]) {

                visited[a] = true;
                arr[a] ++;
                dfs(a);
            }
        }
    }

}
