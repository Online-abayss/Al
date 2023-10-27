package Programmers.level_2;

public class 점_찍기 {

    public static void main(String[] args) {


        int k = 2;
        int d = 4;

        Solution solution = new Solution();

        System.out.println(solution.solution(k, d));
    }

    static class Solution {
        public long solution(int k, int d) {
            long answer = 0;

            for (int i = 0; i <= d; i+= k) {

                long dd = (long) d * d;
                long ii = (long) i * i;
                // 세로 값을 구하기 위한다면, 대각 - 가로 (피타고라스)
                int top = (int) Math.sqrt(dd - ii);

                // k 만큼 증가한다는건 k만큼의 몫만 구하면 된다.
                answer += (top / k) + 1;
            }

            return answer;
        }
    }
}

//https://maicoding.tistory.com/79
