package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _1463 {


    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] answer = new int[n + 1];

        for (int i = 2; i <= n; i++) {

            answer[i] = answer[i-1] + 1;

            if (i % 2 == 0) {

                answer[i] = Math.min(answer[i], answer[i/2] + 1);
            }
            if (i % 3 == 0) {

                answer[i] = Math.min(answer[i], answer[i/3] + 1);
            }

        }
        System.out.println(answer[n]);

    }

}
