package Programmers.level_2;

import java.util.Stack;

public class 짝지어_제거하기_다시풀기 {

    public static void main(String[] args) {

        String s = "baabaa";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution
    {
        public int solution(String s)
        {
            int answer = -1;

            Stack<String> stack_str = new Stack<>();

            String[] arr_s = s.split("");

            for (String a : arr_s) {

                if (!stack_str.isEmpty() && stack_str.peek().equals(a)) {

                    stack_str.pop();
                } else {

                    stack_str.push(a);
                }
            }

            answer = stack_str.isEmpty() ? 1 : 0;

            return answer;
        }
    }

}
