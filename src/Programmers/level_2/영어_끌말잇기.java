package Programmers.level_2;


import java.util.Arrays;
import java.util.Stack;

public class 영어_끌말잇기 {

    public static void main(String[] args) {


        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        int n = 3;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, words)));

    }

    static class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = new int[2];

            int cnt = 0;

            Stack<String> test = new Stack<>();

            for (String s : words) {


                if (test.isEmpty()) {

                    test.push(s);

                } else {

                    String a = test.peek();
                    char last_alpha = a.charAt(a.length() - 1);
                    char first_alpha = s.charAt(0);

                    if (last_alpha != first_alpha || test.contains(s)) {

                        answer[0] = (cnt % n) + 1;
                        answer[1] = (cnt / n) + 1;

                        return answer;
                    }
                }

                cnt += 1;
                test.push(s);
            }

            return answer;
        }
    }

}
