package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _16935 {

    static int h;
    static int w;
    static int r;

    static int[][] map;



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        h = Integer.parseInt(st.nextToken());
        w = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());

        map = new int[h][w];

        for (int i = 0; i < h; i++) {

            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < w; j++) {

                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {

            int cmd = Integer.parseInt(st.nextToken());

            switch (cmd) {

                case 1:
                    one();
                    break;
                case 2:
                    two();
                    break;
                case 3:
                    three();
                    break;
                case 4:
                    four();
                    break;
                case 5:
                    five();
                    break;
                case 6:
                    six();
                    break;
            }
        }




    }

    private static void one() {


    }

}
