package Programmers.level_2;

import java.util.Stack;

public class 짝지어_제거하기 {

    public static void main(String[] args) {

        String s = "baabaa";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

//    static class Solution
//    {
//        public int solution(String s)
//        {
//            int answer = -1;
//
//            Stack<String> stack_str = new Stack<>();
//
//            String[] arr_s = s.split("");
//
//            for (String a : arr_s) {
//
//                if (!stack_str.isEmpty() && stack_str.peek().equals(a)) {
//
//                    stack_str.pop();
//                } else {
//
//                    stack_str.push(a);
//                }
//            }
//
//            answer = stack_str.isEmpty() ? 1 : 0;
//
//            return answer;
//        }
//    }

    // 왜 if (st.isEmpty) 먼저해서 add 하고 else로 peek 만 넣거나 && 넣어서 걸은건 왜 안돼;;
    static class Solution
    {
        public int solution(String s)
        {
            int answer = -1;

            Stack<Character> st = new Stack<>();

            char[] texts= s.toCharArray();

            for (char ch : texts) {

                if (!st.isEmpty() && st.peek() == ch) {

                    st.pop();
                } else {

                    st.add(ch);
                }
            }

            answer = st.isEmpty() ? 1 : 0;

            return answer;
        }
    }
}
