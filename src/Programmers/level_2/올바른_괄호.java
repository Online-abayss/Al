package Programmers.level_2;

public class 올바른_괄호 {

    public static void main(String[] args) {

        String s = ")()(";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution {
        boolean solution(String s) {
            boolean answer = true;

            int cnt = 0;
            char[] ch_arr = s.toCharArray();
            for (int i = 0; i < s.length(); i++) {

                if (cnt <= 0 && ch_arr[i] == ')') {

                    answer = false;
                    return answer;

                } else {

                    if (ch_arr[i] == '(') {

                        cnt += 1;
                    } else {

                        cnt -= 1;
                    }
                }
            }

            if (cnt == 0) {

                answer = true;
            } else {

                answer = false;
            }

            return answer;
        }
    }
}
