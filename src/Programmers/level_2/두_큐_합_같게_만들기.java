package Programmers.level_2;

import java.util.LinkedList;
import java.util.Queue;

public class 두_큐_합_같게_만들기 {

    public static void main(String[] args) {

        int[] queue1 = {1,1};
        int[] queue2 = {1,5};

        Solution solution = new Solution();

        System.out.println(solution.solution(queue1, queue2));


    }

    static class Solution {
        public int solution(int[] queue1, int[] queue2) {
            int answer = -2;

            long sum = 0 ;
            Queue<Integer> q1 = new LinkedList<>();
            Queue<Integer> q2 = new LinkedList<>();
            long q1_sum = 0;

            for (int i = 0; i < queue1.length; i++) {

                sum += (queue1[i] + queue2[i]);
                q1_sum += queue1[i];
                q1.add(queue1[i]);
                q2.add(queue2[i]);

            }

            long goal_number = sum / 2;
            int cnt = 0;
            int number = 0;

            while (true) {

                if (q1_sum == goal_number) {

                    break;
                } else if (cnt >= queue1.length * 3) {

                    cnt = -1;
                    break;
                } else if (q1_sum < goal_number) {

                    number = q2.poll();
                    q1.add(number);
                    q1_sum += number;
                    cnt ++;

                } else if (q1_sum > goal_number) {

                    number = q1.poll();
                    q2.add(number);
                    q1_sum -= number;
                    cnt ++;
                }
            }

            answer = cnt;

            return answer;
        }
    }
}
