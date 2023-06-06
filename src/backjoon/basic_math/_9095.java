package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _9095 {

    static int t;
    static int n;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i ++) {

            n = Integer.parseInt(br.readLine());

            System.out.println(dfs(n));
        }


    }

    private static int dfs(int at) {


        if (at < 3) {

            return at;
        }

        if (at == 3) {

            return 4;
        }

        return dfs(at-1) + dfs(at-2) + dfs(at-3);

    }

}
