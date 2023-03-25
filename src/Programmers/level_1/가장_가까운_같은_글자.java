package Programmers.level_1;

import java.util.Arrays;

public class 가장_가까운_같은_글자 {

    public static void main(String[] args) {

        String s = "banana";

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(s)));

    }

    static class Solution {
        public int[] solution(String s) {
            int[] answer = new int[s.length()];
            // split 해서 동일 단어면 그 split idx 바꾸기.

            String[] arr_str = s.split("");

            for (int i = 0; i < s.length(); i++) {

                if (s.indexOf(arr_str[i]) == i) {

                    answer[i] = -1;
                } else {

                    answer[i] = i - s.indexOf(arr_str[i]);

                    arr_str[s.indexOf(arr_str[i])] = "0";

                    s = String.join("", arr_str);

                }
            }
            return answer;
        }
    }
}
