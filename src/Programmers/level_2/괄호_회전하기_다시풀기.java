package Programmers.level_2;

import java.util.Stack;

public class 괄호_회전하기_다시풀기 {

    public static void main(String[] args) {

        String s = "[](){}";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

//    static class Solution {
//        public int solution(String s) {
//            int answer = -1;
//
//            for (int i = 0; i < s.length(); i++) {
//
//                Stack<Character> st = new Stack<>();
//
//                String str = s.substring(i, s.length()) + s.substring(0, i);
//
//                for (int j = 0; j < str.length(); j++) {
//
//                    char ch = str.charAt(j);
//
//                    if (st.isEmpty()) {
//
//                        st.push(ch);
//                    } else if (ch == ')' && st.peek() == '(') {
//
//                        st.pop();
//                    }  else if (ch == '}' && st.peek() == '{') {
//
//                        st.pop();
//                    }  else if (ch == ']' && st.peek() == '[') {
//
//                        st.pop();
//                    } else {
//
//                        st.push(ch);
//                    }
//                }
//
//                if (st.isEmpty()) {
//
//                    answer += 1;
//                }
//            }
//
//            return answer;
//        }
//    }

    static class Solution {
        public int solution(String s) {
            int answer = -1;



            return answer;
        }
    }


}
