package Programmers.level_2;

import java.util.HashSet;
import java.util.Set;

public class 연속_부분_수열_합의_개수_다시풀기 {

    public static void main(String[] args) {


        int[] elements = {7, 9, 1, 1, 4};

        Solution solution = new Solution();

        System.out.println(solution.solution(elements));

    }


    static class Solution {
        public int solution(int[] elements) {

            int[] new_map = new int[elements.length * 2];

            for (int i = 0; i < elements.length; i++) {

                new_map[i] = elements[i];
                new_map[i + elements.length] = elements[i];
            }

            Set<Integer> set = new HashSet<>();

            for (int i = 0; i <= elements.length; i++) {

                int sum = 0;
                for (int j = i; j < i + elements.length; j++) {

                    sum += new_map[j];
                    set.add(sum);

                }
            }

            return set.size();

        }

    }
}
