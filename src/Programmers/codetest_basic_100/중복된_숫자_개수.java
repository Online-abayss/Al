package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 중복된_숫자_개수 {

    public static void main(String[] args) {

        int[] array = {1,1,2,3,4,5};
        int n = 1;

        Solution solution = new Solution();

        System.out.println(solution.solution(array, n));

    }

    static class Solution {
        public int solution(int[] array, int n) {
            int answer = 0;

            answer = (int) Arrays.stream(array).filter(s -> s == n).count();

            return answer;
        }
    }
}
