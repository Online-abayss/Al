package Programmers.level_2;

import java.util.Arrays;

public class H_index {

    public static void main(String[] args) {

        int[] citations = {3,0, 6, 1, 5};

        Solution solution = new Solution();

        System.out.println(solution.solution(citations));

    }

    static class Solution {
        public int solution(int[] citations) {
            int answer = 0;

            Arrays.sort(citations);

            for (int i = 0; i < citations.length; i++) {

                int h = citations.length - i;

                if (citations[i] > h) {

                    return h;
                }
            }

            return answer;
        }
    }
}
