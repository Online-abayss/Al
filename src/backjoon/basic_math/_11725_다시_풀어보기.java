package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _11725_다시_풀어보기 {

    static int n ;
    static int[] parent;
    static boolean[] visited;

    static ArrayList<ArrayList<Integer>> node_lst = new ArrayList<>(); //        ArrayList[] node_lst = new ArrayList[n+1];

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        visited = new boolean[n + 1];
        parent = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {

//            node_lst[i] = new ArrayList<Integer>();
            node_lst.add(new ArrayList<>());
        }

        for (int i = 0; i < n - 1; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            node_lst.get(a).add(b);
            node_lst.get(b).add(a);

//            node_lst[a].add(b);
//            node_lst[b].add(a);

        }

        dfs(1);

        for (int i = 2; i < parent.length; i++) {

            System.out.println(parent[i]);
        }

//        for (int i = 0 ; i < node_lst.size(); i++) {
//
//            System.out.println(node_lst.get(i) + " // parent : " + parent[i] );
//
//        }

    }

    private static void dfs(int i) {

        visited[i] = true;

        for (int j : node_lst.get(i)) {

            if (!visited[j]) {

                dfs(j);

                parent[j] = i;
            }
        }
    }
}
