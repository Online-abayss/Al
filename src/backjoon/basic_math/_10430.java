package backjoon.basic_math;

//https://st-lab.tistory.com/41 scanner랑 bufferedReader의 차이점을 분명하게 알려줌


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10430 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        System.out.println((A + B) % C);
        System.out.println((A % C + B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C * B % C) % C);

    }
}
