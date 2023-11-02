package Programmers.level_2;

import java.util.Arrays;
import java.util.Stack;


// https://annyeongworld.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EC%8A%A4%ED%83%9D%ED%81%90-%EC%A3%BC%EC%8B%9D%EA%B0%80%EA%B2%A9-JAVA-%EC%9E%90%EB%B0%94%ED%92%80%EC%9D%B4
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

            // price.0 = 1 > price.1 = 2
            // price.1 = 2 > price.2 = 3;
            // price.2 = 3 > price.3 = 2;

            while (!stack.isEmpty() && prices[stack.peek()] > prices[i]) {

                // idx = stack.peek() = 2;
                // i = 3
                int idx = stack.pop();

                answer[idx] = i - idx;
                System.out.println(idx);
                System.out.println(i);
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
