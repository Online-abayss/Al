package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _17413 {



    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> test_stack = new Stack<>();
        Queue<String> test_queue = new LinkedList<>();

        String[] input_text = br.readLine().split("");
        String pop_text = "";

        int cnt = 0;

        int black_cnt = 0;

        for (String s : input_text) {

            if (s.equals("<")) {

                cnt = 1;

                while (!test_stack.isEmpty()) {

                    System.out.print(test_stack.pop());
                }

                System.out.print(s);
            } else if (s.equals(">")) {

                cnt = 0;
                System.out.print(s);

            } else if (cnt == 1) {

                System.out.println(s);
            } else if (cnt == 0) {


            }
        }

    }


}
