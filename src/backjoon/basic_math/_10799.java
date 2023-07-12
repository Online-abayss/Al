package backjoon.basic_math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _10799 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        String text = br.readLine();

        Stack<String> stack_answer = new Stack<>();

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == '(') {

                stack_answer.add("(");
            } else {

                if (text.charAt(i -1) == '(') {

                    stack_answer.pop();
                    cnt += stack_answer.size();
                } else {

                    stack_answer.pop();
                    cnt += 1;
                }
            }
        }
        System.out.println(cnt);
    }
}
