package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3085 {

    static char[][] arr;
    static int t;
    static int max;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        arr = new char[t][t];

        for (int i = 0; i < t; i++) {

            String case_candy = br.readLine();

            for (int j = 0; j < t; j++) {

                arr[i][j] = case_candy.charAt(j);
            }
        }

        // 가로
        for (int i = 0; i < t - 1; i++) {

            for (int j = 0; j < t; j++) {

                swap_arr(i, j, i + 1 , j);
                search();
                swap_arr(i + 1, j, i, j);

            }
        }

        // 세로
        for (int i = 0; i < t; i++) {

            for (int j = 0; j < t - 1; j++) {

                swap_arr(i, j, i , j + 1);
                search();
                swap_arr(i, j + 1, i, j);

            }
        }

        System.out.println(max);

    }

    private static void search() {

        for (int i = 0; i < t; i++) {
            int cnt = 1;

            for (int j = 0; j < t -1; j++) {

                if (arr[i][j] == arr[i][j + 1] ) {

                    cnt ++;
                    max = Math.max(cnt, max);
                } else {

                    cnt = 1;
                }
            }
        }

        for (int i = 0; i < t; i++) {
            int cnt = 1;

            for (int j = 0; j < t - 1; j++) {

                if (arr[j][i] == arr[j + 1][i] ) {

                    cnt ++;
                    max = Math.max(cnt, max);
                } else {

                    cnt = 1;
                }
            }
        }

    }

    private static void swap_arr(int i, int j, int i1, int j1) {

        char temp = arr[i][j];
        arr[i][j] = arr[i1][j1];
        arr[i1][j1] = temp;
    }


}
