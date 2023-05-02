package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class _3085 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        List<String> str_lst = new ArrayList<>();

        for (int i = 0; i < t; i++) {

            String[] arr_str = br.readLine().split("");

            for (String s : arr_str) {

                str_lst.add(s);
            }
        }



        System.out.println(str_lst);


    }
}
