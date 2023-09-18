package Programmers.level_2;

import java.util.Arrays;
import java.util.Stack;

public class 주식가격_다음날풀기 {


    public static void main(String[] args) {

        int[] prices = {1,2,3,2,3};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(prices)));
    }

    static class Solution {
    public int[] solution(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        int[] answer = new int[prices.length];


        for (int i = 0; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {

                int idx = stack.pop();

                answer[idx] = i - idx;
            }

            stack.push(i);
        }

        while (!stack.isEmpty()) {

            int idx = stack.pop();
            answer[idx] = prices.length - idx - 1;
        }



        return answer;

    }
}
}
