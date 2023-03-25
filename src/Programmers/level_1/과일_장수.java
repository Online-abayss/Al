package Programmers.level_1;


import java.util.Arrays;
import java.util.Stack;

public class 과일_장수 {

    public static void main(String[] args) {

//        int k = 3;
//        int m = 4;
//        int[] score = {1,2,3,1,2,3,1};

        int k = 4;
        int m = 3;
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};


        Solution solution = new Solution();
        System.out.println(solution.solution(k,m,score));

    }

    static class Solution {
        public int solution(int k, int m, int[] score) {
            int answer = 0;

            Arrays.sort(score);

            Stack<Integer> stack = new Stack<>();

            for (int i = score.length -1; i >= 0; i--) {

                stack.push(score[i]);

                if (stack.size() >= m) {

                    int min_num = Math.min(stack.get(0), stack.get(m-1));

                    answer += m * min_num;

                    for (int j = 0; j < m; j++) {

                        stack.pop();
                    }
                }
            }

            return answer;
        }
    }
}
