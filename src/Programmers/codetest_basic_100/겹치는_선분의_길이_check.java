package Programmers.codetest_basic_100;


import java.util.HashMap;
import java.util.Map;

// 내가 풀려던 방식은 잘못됬다는걸 알게되어서 빡쳐서 유튜브에 강의 들음.
public class 겹치는_선분의_길이_check {

    public static void main(String[] args) {

//        int[][] lines= {{0, 1}, {2, 5}, {3, 9} };
        int[][] lines= {{0, 5}, {3, 9}, {1, 10} };


        Solution solution = new Solution();

        System.out.println(solution.solution(lines));

    }

    static class Solution {
        public int solution(int[][] lines) {
            int answer = 0;
            int[] arr = new int[200];

            for (int i = 0; i < lines.length; i++) {

                for (int j =lines[i][0] + 100; j <lines[i][1] +100 ; j++) {

                    arr[j]++;
                }
            }

            for (int i =0; i < 200; i++) {

                if(arr[i] > 1) {
                    answer++;
                }

            }

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.HashMap;
//        import java.util.Map;
//class Solution {
//    public int solution(int[][] lines) {
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i=0; i<lines.length; i++) {
//            int min = Math.min(lines[i][0], lines[i][1]);
//            int max = Math.max(lines[i][0], lines[i][1]);
//
//            for (int j=min; j<max; j++) {
//                map.put(j, map.getOrDefault(j, 0) + 1);
//            }
//        }
//
//        int answer = 0;
//
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() >= 2) {
//                answer++;
//            }
//        }
//
//        return answer;
//    }
//}
