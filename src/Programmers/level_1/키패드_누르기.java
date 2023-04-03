package Programmers.level_1;

public class 키패드_누르기 {

    public static void main(String[] args) {

        int[] number = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";

        Solution solution = new Solution();

        System.out.println(solution.solution(number, hand));

    }


    static class Solution {
        public String solution(int[] numbers, String hand) {
            String answer = "";

            hand_Position left_position = new hand_Position(3, 0);
            hand_Position right_position = new hand_Position(3, 2);

            for (int a : numbers) {

                hand_Position numPos = new hand_Position((a -1) / 3, (a - 1) % 3);
                if (a == 0) {

                    numPos.row = 3;
                    numPos.col = 1;
                }
            }

            return answer;
        }
        
    }

    static class  hand_Position{

        int row;
        int col;

        hand_Position(int row, int col) {

            this.row = row;
            this.col = col;
        }
    }
}
