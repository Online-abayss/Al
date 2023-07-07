package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2003 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] two_point = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {

            two_point[i] = Integer.parseInt(st.nextToken());

        }

        int cnt = 0;
        int sum = 0;
        int s = 0;
        int e = 0;

        while (true) {

            if (sum >= m) {

                sum -= two_point[s++];

            } else if (e > n - 1) {

                break;

            } else {

                sum += two_point[e++];

            }

            if (sum == m) {

                cnt ++;
            }
        }

        System.out.println(cnt);

    }
}
