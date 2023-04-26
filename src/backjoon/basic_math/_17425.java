package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _17425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());



        for (int i = 0; i < a; i++) {

            int answer = 0;

            int b = Integer.parseInt(br.readLine());

            for (int j = 1; j <= b; j++) {

                answer += (b / j) * j;
            }

            System.out.println(answer);
        }
    }
}
