package Programmers.level_2;

import java.util.Arrays;
import java.util.Stack;

public class 구멍보트 {

    public static void main(String[] args) {

        int[] people = {70,50,80,50};
        int limit = 100;

        Solution solution = new Solution();

        System.out.println(solution.solution(people, limit));

    }

    static class Solution {
        public int solution(int[] people, int limit) {

            int answer = 0;

            Arrays.sort(people);

            int idx = 0;

            for (int i = people.length - 1; i >= idx; i--) {

                if (people[i] + people[idx] <= limit) {

                    idx += 1;
                    answer += 1;
                } else {

                    answer += 1;
                }
            }

            return answer;
        }
    }
}
