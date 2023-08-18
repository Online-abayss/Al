package Programmers.level_2;

public class 점프와_순간_이동 {

    public static void main(String[] args) {

        int n = 5000;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }


    static public class Solution {
        public int solution(int n) {
            int ans = 0;

            int goal_number = 1;

            while (true) {

                if (n == goal_number) {

                    ans += 1;
                    break;
                }

                if (n % 2 > 0) {

                    n -= 1;
                    ans += 1;
                } else {

                    n /= 2;
                }
            }

            return ans;
        }

    }
}
