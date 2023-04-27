package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _17425 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        long[] fx = new long[1000001];
        long[] gx = new long[1000001];

        Arrays.fill(fx, 1);

        for (int i = 2; i < fx.length; i++) {

            for (int j = 1; i*j < fx.length; j++) {

                fx[i*j] += i;
            }

        }

        for (int i = 1; i < fx.length; i++) {

            gx[i] = gx[i-1] + fx[i];
        }

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            sb.append(gx[Integer.parseInt(br.readLine())] + "\n");
        }

        System.out.println(sb);
    }
}
