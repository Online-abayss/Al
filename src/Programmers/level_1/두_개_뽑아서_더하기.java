package Programmers.level_1;

import java.util.Arrays;
import java.util.HashSet;

// mapToInt(Integer::intValue) 잊지말자.
public class 두_개_뽑아서_더하기 {

    public static void main(String[] args) {

        int[] numbers = {2,1,3,4,1};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(numbers)));

    }

    static class Solution {
        public int[] solution(int[] numbers) {

            HashSet<Integer> hashSet = new HashSet<>();

            for (int i = 0; i < numbers.length-1; i++) {

                for (int j = i + 1; j <numbers.length; j++) {

                    hashSet.add(numbers[i] + numbers[j]);
                }
            }

            int[] answer = hashSet.stream().mapToInt(s -> s).sorted().toArray();

            return answer;
        }
    }
}
