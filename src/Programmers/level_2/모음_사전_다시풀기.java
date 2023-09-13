package Programmers.level_2;

import java.util.ArrayList;
import java.util.List;

public class 모음_사전_다시풀기 {

    public static void main(String[] args) {

        String word = "AAAAE";

        Solution solution = new Solution();

        System.out.println(solution.solution(word));


    }

    static String[] words = {"A", "E", "I", "O", "U"};
    static List<String> lst = new ArrayList<>();
    static class Solution {


        public int solution(String word) {

            int answer = 0;
            dfs("", 0);

            for (int i = 0; i < lst.size(); i++) {

                if (lst.get(i).equals(word)) {

                    answer = i;
                    break;
                }
            }


            return answer;
        }

        private void dfs(String s, int i) {

            lst.add(s);
            if (i == 5) {

                return;
            }

            for (int j = 0; j < 5; j++) {

                dfs(s + words[j], i + 1);
            }
        }
    }
}
