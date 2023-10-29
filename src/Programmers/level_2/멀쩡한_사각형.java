package Programmers.level_2;

public class 멀쩡한_사각형 {

    public static void main(String[] args) {

        int w = 8;
        int h = 12;

        Solution solution = new Solution();

        System.out.println(solution.solution(w,h));
    }

    static class Solution {
        public long solution(int w, int h) {
            long answer = 1;

            long n = gcd(w,h);
            answer = (long) w * h - ((long) (w / n + h / n -1) * n );

            return answer;
        }

        private long gcd(int w, int h) {

            if (w % h == 0) {

                return h;
            }

            return gcd(h , w % h);

        }

    }
}
