package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모의고사 {

    public static void main(String[] args) {

//        int[] answer = {1,2,3,4,5};

        int[] answer = {1,3,2,4,2};
        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(answer)));

    }

    static class Solution {
        public int[] solution(int[] answers) {
            List<Integer> winners =  new ArrayList<>();

            int[] a = {1,2,3,4,5};
            int[] b = {2,1,2,3,2,4,2,5};
            int[] c = {3,3,1,1,2,2,4,4,5,5};

            int cnt_a = 0; int cnt_b = 0; int cnt_c = 0;

            for (int i = 0; i < answers.length; i++) {

                if (a[i % a.length] == answers[i]) {

                    cnt_a ++;
                }
                if (b[i % b.length] == answers[i]) {

                    cnt_b ++;
                }
                if (c[i % c.length] == answers[i]) {

                    cnt_c ++;

                }
            }
            int max_num = Math.max(cnt_a, Math.max(cnt_b,cnt_c));

            if (max_num == cnt_a) {

                winners.add(1);
            }
            if (max_num == cnt_b) {

                winners.add(2);
            }
            if (max_num == cnt_c) {

                winners.add(3);
            }

            int[] answer = new int[winners.size()];

            for (int j = 0; j < winners.size(); j++) {

                answer[j] = winners.get(j);
            }

            return answer;
        }
    }
}
