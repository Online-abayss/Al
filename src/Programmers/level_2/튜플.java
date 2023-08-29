package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;

public class 튜플 {


    public static void main(String[] args) {

        String s = "{{2,1},{2},{2,1,3},{2,1,3,4}}";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution {
        public ArrayList<Integer> solution(String s) {
            ArrayList<Integer> answer = new ArrayList<>();

            s = s.substring(2, s.length() -2);

            s = s.replace("},{", " ");

            String[] text = s.split(" ");


            Arrays.sort(text, (o1, o2) -> Integer.compare(o1.length(), o2.length()));

            for (String a : text) {

                String[] check_number = a.split(",");

                for (String b : check_number) {

                    int number_b = Integer.parseInt(b);
                    if (!answer.contains(number_b)) {

                        answer.add(number_b);
                    }
                }
            }

            return answer;
        }
    }
}
