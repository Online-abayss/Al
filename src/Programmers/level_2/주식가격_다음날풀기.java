package Programmers.level_2;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격_다음날풀기 {


    public static void main(String[] args) {

        int[] prices = {1,2,3,2,3};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(prices)));
    }
// 1,2,3  /3   / 4
    // 2
    static class Solution {
        public int[] solution(int[] prices) {

            int len = prices.length;

            int[] answer = new int[len];

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < len; i++) {

                while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {

                    int idx = stack.pop();
                    answer[idx] = i - idx;
                    System.out.println(i);
                }
                stack.push(i);
            }

            return answer;
        }
    }
}
