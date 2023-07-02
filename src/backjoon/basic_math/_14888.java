package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _14888 {

    static int t;

    static int[] map;

    static int[] symbol;

    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());

        map = new int[t];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < t; i++) {

            map[i] = Integer.parseInt(st.nextToken());
        }

        symbol = new int[t];

        st = new StringTokenizer(br.readLine());

        for (int i = 0;  i < 4; i++) {

            symbol[i] = Integer.parseInt(st.nextToken());
        }

        dfs(symbol[0], 0);
    }

    private static void dfs(int now_num, int depth) {

        if (depth == t) {

            max = Math.max(max, now_num);
            min = Math.min(min, now_num);
            return;
        }

        for (int i = 0; i < 4; i++) {

            if (symbol[i] > 0) {

                symbol[i] --;

                switch (i) {

                    case 0:
                        dfs(now_num + map[depth], depth + 1);
                        break;
                    case 1:
                        dfs(now_num - map[depth], depth + 1);
                        break;
                    case 2:
                        dfs(now_num * map[depth], depth + 1);
                        break;
                    case 3:
                        dfs(now_num / map[depth], depth + 1);
                        break;
                }

                symbol[i] ++;
            }
        }



    }
}
