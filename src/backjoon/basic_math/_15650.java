package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _15650 {

    static boolean[] visited;

    static int[] arr;

    static int n;
    static int m;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[m];

        dfs(1,0);

    }

    private static void dfs(int i1, int depth) {

        if (depth == m) {

            for (int a : arr) {

                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }

        for (int i = i1; i <= n; i++) {

            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }
}

// https://codesign.tistory.com/entry/%EB%B0%B1%EC%A4%80-15650-N%EA%B3%BC-M-2-JAVA%EB%B0%B1%ED%8A%B8%EB%9E%98%ED%82%B9
