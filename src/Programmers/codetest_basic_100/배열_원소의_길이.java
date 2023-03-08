package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 배열_원소의_길이 {

    public static void main(String[] args) {

        String[] strlist = {"We", "are", "the", "world!"};

        Solution solution = new Solution();

        System.out.println(solution.solution(strlist));
    }

    static class Solution {
        public int[] solution(String[] strlist) {

            List len_lst = new ArrayList<>();

            for (String s : strlist) {

                len_lst.add(s.length());
            }

            int[] answer = Arrays.stream(len_lst.toArray()).mapToInt(String::parseInt);

            return answer;
        }
    }
}
