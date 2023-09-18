package Programmers.level_2;

import java.util.Arrays;
import java.util.Stack;

public class 뒤에_잇는_큰_수_찾기_주식시장과 {

    public static void main(String[] args) {

        int[] numbers = {9, 1, 5, 3, 6, 2};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(numbers)));


    }

    // 예상했다 내 방식대로 풀면 시간초과로 떙칠거라는걸 (2중포문은 안된다 극단적으로 생각하면 시간복잡도는 백만의 제곱일듯
//    static class Solution {
//        public int[] solution(int[] numbers) {
//
//            Stack<Integer> stack = new Stack<>();
//
//            int[] answer = new int[numbers.length];
//
//            stack.push(0);
//
//            for (int i = 1; i < numbers.length; i++) {
//
//                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {
//
//                    answer[stack.pop()] = numbers[i];
//                }
//
//                stack.push(i);
//            }
//
//            while (!stack.isEmpty()) {
//
//                answer[stack.pop()] = -1;
//            }
//
//            return answer;
//        }
//    }

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < numbers.length; i++) {

                while (!stack.isEmpty() && numbers[stack.peek()] < numbers[i]) {

                    int idx = stack.pop();
                    answer[idx] = numbers[i];
                }

                stack.push(i);
            }

            while (!stack.isEmpty()) {

                int idx = stack.pop();
                answer[idx] = -1;
            }

            return answer;
        }
    }
}
