package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _1182 {

    static int t;
    static int sum;
    static int cnt;

    static int[] numbers_arr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        t = Integer.parseInt(st.nextToken());
        sum = Integer.parseInt(st.nextToken());

        StringTokenizer numbers_st = new StringTokenizer(br.readLine());

        numbers_arr = new int[t];

        for (int i = 0; i < t; i++) {

            numbers_arr[i] = Integer.parseInt(numbers_st.nextToken());
        }

        dfs(0,0);

        System.out.println(cnt);
    }

    private static void dfs(int i, int sum_numbers) {

        if ( i >= t) {

            return;
        }

        sum_numbers += numbers_arr[i];

        if (sum_numbers == sum) {

            cnt ++;
        }

        dfs(i + 1, sum_numbers - numbers_arr[i]);
        dfs( i + 1, sum_numbers);

    }
}
