package Programmers.codetest_basic_100;

public class 피자_나눠_먹기_1 {

    public static void main(String[] args) {

        int n = 15;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            answer = (n % 7) > 0 ? (n / 7) + 1 : n / 7;

            return answer;
        }
    }
}

// 다른사람 풀이

//신기.
// class Solution {
//    public int solution(int n) {
//        return (n + 6) / 7;
//    }
//}
