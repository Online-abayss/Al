package Programmers.level_2;

import java.util.Arrays;

public class n2_배열_자르기 {

    public static void main(String[] args) {

        int n = 3;
        int left = 2;
        int right = 5;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n , left, right)));

    }

    static class Solution {
        public int[] solution(int n, long left, long right) {

            int sum = (int) (right - left + 1);
            int[] answer = new int[sum];
            int idx = 0;

            for (long i =  left; i <= right; i++) {

                answer[idx] = Math.max((int) (i / n) , (int) (i % n)) + 1;
                idx += 1;
            }

            return answer;
        }
    }
}
