package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class _1707_다시풀어보기 {

    static int dot;
    static int line;
    static ArrayList<ArrayList<Integer>> map_lst = new ArrayList<>();
    static int[] color;
    static boolean end;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int a = 0; a < t; a++) {

            StringTokenizer dot_line_st = new StringTokenizer(br.readLine());

            dot = Integer.parseInt(dot_line_st.nextToken());
            line = Integer.parseInt(dot_line_st.nextToken());

            for (int i = 0; i < dot + 1; i++) {

                map_lst.add(new ArrayList<>());
            }

            for (int i = 0; i < line; i++ ) {

                StringTokenizer st = new StringTokenizer(br.readLine());

                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map_lst.get(x).add(y);
                map_lst.get(y).add(x);

            }

            color = new int[dot + 1];

            for (int i = 1 ; i <= dot; i++) {

                if (color[i] == 0) {

                    dfs(i, 1);
                }

                if (!end) {

                    break;
                }

            }
            if (end) {

                System.out.println("YES");
            } else {

                System.out.println("NO");
            }

        }

    }

    private static void dfs(int i, int now_color) {

        color[i] = now_color;

        for (int a : map_lst.get(i)) {

            if (color[a] == now_color) {

                end = false;
                return;
            }

            if ( color[a] == 0) {

                dfs(a, now_color * -1);
            }
        }
    }

}
// https://settembre.tistory.com/286
