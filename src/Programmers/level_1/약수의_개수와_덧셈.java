package Programmers.level_1;

public class 약수의_개수와_덧셈 {

    public static void main(String[] args) {

        int left = 13;
        int right = 17;

        Solution solution = new Solution();

        System.out.println(solution.solution(left, right));

    }

    static class Solution {
        public int solution(int left, int right) {
            int answer = 0;

            for (int i = left; i <= right; i++) {

                if ((int)Math.sqrt(i) == Math.sqrt(i)) {

                    answer -= i;
                } else {

                    answer += i;
                }

            }

            return answer;
        }
    }
}
