package Programmers.level_2;

import java.util.Stack;

public class 택배상자 {

    public static void main(String[] args) {

        int[] order = {4,3,1,2,5};

        Solution solution = new Solution();

        System.out.println(solution.solution(order));

    }

    static class Solution {
        public int solution(int[] order) {
            int answer = 0;

            int x = 0;

            int now_box = 1;

            Stack<Integer> stack = new Stack<>();

            while (x < order.length) {

                if (order[x] > now_box) {

                    stack.push(now_box);
                    now_box ++;
                } else if (order[x] == now_box) {

                    answer ++;
                    x ++;
                    now_box++;
                } else {

                    while (!stack.isEmpty() && order[x] == stack.peek()) {

                        stack.pop();
                        answer++;
                        x++;
                    }

                    if (x >= order.length || order[x] < now_box) {

                        break;
                    }
                }
            }

            return answer;
        }
    }
}
