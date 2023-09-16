package Programmers.level_2;

import java.util.Stack;

public class 스킬트리 {

    public static void main(String[] args) {

        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};

        Solution solution = new Solution();

        System.out.println(solution.solution(skill, skill_trees));

    }

    static class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = -1;

            for (String s : skill_trees) {

                String temp_skill = s;

                for (int i =0; i < s.length(); i++) {

                    String word = s.substring(i, i+1);

                    if (!skill.contains(word)) {

                        temp_skill = temp_skill.replace(word, "");
                    }
                }

                if (s.indexOf(temp_skill) == 0) {

                    answer ++;
                }
            }


            return answer;
        }
    }
}
