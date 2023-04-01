package Programmers.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class 크레인_인형뽑기_게임 {

    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        Solution solution = new Solution();

        System.out.println(solution.solution(board, moves));

    }

    static class Solution {
        public int solution(int[][] board, int[] moves) {

            int answer = 0;

            List<Integer> crane_stack = new ArrayList<>();

            for (int a : moves) {

                for (int i = 0; i < board.length; i++) {

                    if (board[i][a -1] == 0) {

                        continue;
                    } else {

                        crane_stack.add(board[i][a-1]);
                        board[i][a-1] = 0;
                        break;
                    }
                }

                if (crane_stack.size() > 1) {

                    if (crane_stack.get(crane_stack.size() -1) == crane_stack.get(crane_stack.size() -2)) {

                        answer ++;
                        crane_stack.remove(crane_stack.size() -1);
                        crane_stack.remove(crane_stack.size() -1);
                    }
                }
            }

            return answer *2;
        }
    }
}

// 다른사람 풀이

// 내가 처음으로 해보고 싶은 스택버전

//import java.util.Stack;
//
//class Solution {
//    public int solution(int[][] board, int[] moves) {
//        int answer = 0;
//        Stack<Integer> stack = new Stack<>();
//        for (int move : moves) {
//            for (int j = 0; j < board.length; j++) {
//                if (board[j][move - 1] != 0) {
//                    if (stack.isEmpty()) {
//                        stack.push(board[j][move - 1]);
//                        board[j][move - 1] = 0;
//                        break;
//                    }
//                    if (board[j][move - 1] == stack.peek()) {
//                        stack.pop();
//                        answer += 2;
//                    } else
//                        stack.push(board[j][move - 1]);
//                    board[j][move - 1] = 0;
//                    break;
//                }
//            }
//        }
//        return answer;
//    }
//}
