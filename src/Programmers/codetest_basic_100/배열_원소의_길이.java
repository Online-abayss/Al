package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_원소의_길이 {

    public static void main(String[] args) {

        String[] strlist = {"We", "are", "the", "world!"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(strlist)));
    }

    static class Solution {
        public int[] solution(String[] strlist) {

            List<Integer> len_lst = new ArrayList<Integer>();

            for (String s : strlist) {

                len_lst.add(s.length());
            }

            int[] answer = len_lst.stream().mapToInt(x -> x).toArray();

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(String[] strList) {
//        return Arrays.stream(strList).mapToInt(String::length).toArray();
//    }
//}
