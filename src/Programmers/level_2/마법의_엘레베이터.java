package Programmers.level_2;

import java.util.ArrayList;

public class 마법의_엘레베이터 {


    public static void main(String[] args) {

        int storey = 16;

        Solution solution = new Solution();

        System.out.println(solution.solution(storey));

    }

    static class Solution {
        public int solution(int storey) {
            int answer = 0;

            while (storey > 0) {

                int number = storey % 10;

                storey /= 10;

                if (number > 5) {

                    answer += 10 - number;
                    storey ++;

                } else if (number < 5){

                    answer += number;

                    // 95라고 하면 6번밖에 안되지만 45는 9번해야하는 차이를 확인하기 위해 다시 10를 나눈 나머지로 5 넘는지 확인
                } else if (storey % 10 >= 5){

                    answer += 5;
                    storey ++;
                } else {

                    answer += 5;
                }

            }

            return answer;
        }
    }
}
