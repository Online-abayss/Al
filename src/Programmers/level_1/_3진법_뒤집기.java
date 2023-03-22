package Programmers.level_1;


// Stringbuilder 의 reverse 생각하자 String test2 = new StringBuilder(test).reverse().toString();
public class _3진법_뒤집기 {

    public static void main(String[] args) {

        int n = 45;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            String[] s = Integer.toString(n, 3).split("");

            String reverse_s = "";

            for (int i = s.length -1; i >= 0; i--) {

                reverse_s += s[i];
            }

            answer = Integer.parseInt(reverse_s, 3);

            return answer;
        }
    }
}
