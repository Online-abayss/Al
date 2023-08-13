package Programmers.level_2;

public class 숫자의_표현 {


    public static void main(String[] args) {

        int n = 15;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            for (int i = 1; i <= n; i++) {

                int sum = 0;

                for (int j = i; j <= n; j++) {

                    sum += j;

                    if (sum == n) {

                        answer += 1;
                        break;
                    } else if (sum > n) {

                        break;
                    }
                }
            }


            return answer;
        }
    }

}
