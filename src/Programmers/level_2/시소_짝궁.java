package Programmers.level_2;

import java.util.Arrays;

public class 시소_짝궁 {

    public static void main(String[] args) {


        int[] weights = {100,180,360,100,270};

        Solution solution = new Solution();

        System.out.println(solution.solution(weights));

    }

    static class Solution {
        public long solution(int[] weights) {
            long answer = 0;

            Arrays.sort(weights);

            for (int i = 0; i < weights.length - 1; i++) {

                for (int j = i + 1; j < weights.length; j++) {

                    if (weights[i] * 2 < weights[j]) {
                        break;
                    } else if (weights[i] == weights[j]) {

                        answer ++;
                    } else if (weights[i] * 2 == weights[j]) {

                        answer ++;
                    } else if (weights[i] * 3 == weights[j] * 2) {

                        answer ++;
                    } else if (weights[i] * 4 == weights[j] * 3) {

                        answer ++;
                    }
                }
            }

            return answer;
        }
    }
}

//https://mag1c.tistory.com/295
