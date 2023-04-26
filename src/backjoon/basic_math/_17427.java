package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class _17427 {

    public static void main(String[] args) throws IOException {

        long answer = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i <= n; i++) {

            answer += (n / i) * i;
        }

        System.out.println(answer);
    }
}
