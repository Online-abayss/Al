package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _1476 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] br_arr = br.readLine().split(" ");

        int cnt = 1;
        while(true) {

            int e = cnt % 15;
            int s = cnt % 28;
            int m = cnt % 19;

            if (e == 0) {

                e = 15;
            }
            if (s == 0) {

                s = 28;
            }
            if (m == 0) {

                m = 19;
            }

            if (e == Integer.parseInt(br_arr[0]) && s == Integer.parseInt(br_arr[1]) && m == Integer.parseInt(br_arr[2])) {

                System.out.println(cnt);
                break;
            }
            cnt++;
        }
    }
}
