package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class K번째수 {

    public static void main(String[] args) {

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3}, {4,4,1}, {1,7,3}};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(array, commands)));

    }

    static class Solution {
        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < commands.length; i++) {

                List<Integer> test = new ArrayList<>();

                for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {

                    test.add(array[j]);
                }

                Collections.sort(test);

                answer[i] = test.get(commands[i][2] - 1 );

            }

            return answer;
        }
    }
}

//다른사람 풀이

//import java.util.Arrays;
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = new int[commands.length];
//
//        for(int i=0; i<commands.length; i++){
//            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
//            Arrays.sort(temp);
//            answer[i] = temp[commands[i][2]-1];
//        }
//
//        return answer;
//    }
//}
