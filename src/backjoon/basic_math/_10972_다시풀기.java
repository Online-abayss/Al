package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _10972_다시풀기 {
    static int t;
    static int[] numbers_arr;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        t = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

       numbers_arr = new int[t];

        for (int i = 0; i < t; i++) {

            numbers_arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] answer = new int[t];

        Loop1:
        for (int i = t - 1; i > 0; i --) {

            if (numbers_arr[i -1] < numbers_arr[i]) {

                for (int j = t - 1; t >= i; j --) {

                    if (numbers_arr[i -1] < numbers_arr[i]) {

                        int temp = numbers_arr[i - 1];
                        numbers_arr[i - 1] = numbers_arr[i];
                        numbers_arr[i] = temp;
                        answer = numbers_arr;

                        int k = t - 1;
                        while (i < k) {

                            int temp2 = numbers_arr[i];
                            numbers_arr[i] = numbers_arr[k];
                            numbers_arr[k] = temp2;
                            i++;
                            k++;
                        }
                        break Loop1;

                    }

                }

        }

    }

        if (answer[0] == 0) {

            System.out.println(-1);
        } else {

            for (int i = 0; i < answer.length; i++) {

                System.out.print(answer[i] + " ");
            }
        }

    }

}
