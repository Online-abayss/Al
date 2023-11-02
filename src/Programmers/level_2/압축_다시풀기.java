package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 압축_다시풀기 {

    public static void main(String[] args) {

        String msg = "KAKAO";

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(msg)));

    }

//    static class Solution {
//        public int[] solution(String msg) {
//
//            HashMap<String, Integer> dictionary = new HashMap<>();
//
//            int diction_idx = 1;
//
//            for (int i = 'A'; i <= 'Z'; i++) {
//
//                dictionary.put(String.valueOf((char)i), diction_idx ++);
//            }
//
//            ArrayList<Integer> lst = new ArrayList<>();
//
//            int idx = 0;
//            while (idx < msg.length()) {
//
//                String w = "";
//
//                while (idx < msg.length()) {
//
//                    if (!dictionary.containsKey(w + msg.charAt(idx))) {
//
//                        break;
//                    } else {
//
//                        w += msg.charAt(idx);
//                    }
//                    idx ++;
//                }
//
//                lst.add(dictionary.get(w));
//                if (idx < msg.length()) {
//
//                    dictionary.put(w + msg.charAt(idx), diction_idx ++);
//                }
//            }
//
//            int[] answer = new int[lst.size()];
//
//            for (int i = 0; i < lst.size(); i++) {
//
//                answer[i] = lst.get(i);
//            }
//
//            return answer;
//        }
//
//
//    }

    static class Solution {
        public int[] solution(String msg) {
            int[] answer = {};


            return answer;
        }
    }
}
