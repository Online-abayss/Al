package Programmers.level_1;

import java.util.Arrays;

public class 로또의_최고_순위와_최저_순위 {

    public static void main(String[] args) {

//        int[] lottos = {44,1,0,0,31,25};
//        int[] win_nums = {31,10,45,1,6,19};

        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(lottos, win_nums)));

    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {

            int match_num = 0;
            int zero_cnt = 0;

            for (int i = 0; i < lottos.length; i++) {

                for (int j = 0; j < win_nums.length; j++) {

                    if (lottos[i] == 0) {

                        zero_cnt ++;
                        break;
                    } else if (lottos[i] == win_nums[j]) {

                        match_num ++;
                        break;
                    }
                }
            }

            if ( match_num == 0  && zero_cnt == 0) {

                match_num = 1;
            }

            int[] answer = {7 - match_num - zero_cnt, zero_cnt == 6 ? 6 : 7 - match_num};

            return answer;
        }
    }
}
