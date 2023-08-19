package Programmers.level_2;

public class 예상_대진표_고민하기 {

    public static void main(String[] args) {

        int n = 8, a = 4, b = 7;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, a , b));

    }

    static class Solution
    {
        public int solution(int n, int a, int b)
        {
            int answer = 0;

            while (a != b) {

                a = (a / 2) + (a % 2);
                b = (b / 2) + (b % 2);
                answer ++;
            }

            return answer;
        }
    }
}
