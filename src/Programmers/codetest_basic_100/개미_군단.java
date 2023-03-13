package Programmers.codetest_basic_100;

public class 개미_군단 {

    public static void main(String[] args) {

        int hp = 999;

        Solution solution = new Solution();

        System.out.println(solution.solution(hp));

    }
// 장군 5 , 병정 3, 일 1
    static class Solution {
        public int solution(int hp) {
            int answer = 0;

            answer += hp / 5;
            answer += (hp % 5) / 3;
            answer += (hp % 5) % 3;


            return answer;
        }
    }
}
