package Programmers.codetest_basic_100;

import java.math.BigDecimal;

// 우연히 나누기에 대해 좀 찾아보다가 BigDecimal 이라는 함수를 알게됨.
// 하지만 알고리즘? 으로 푼건 아니기에 조금 찝찝함.
public class 유한소수_판별하기 {


    public static void main(String[] args) {

        int a = 12;
        int b = 21;

        Solution solution = new Solution();

        System.out.println(solution.solution(a, b));

    }


    static class Solution {
        public int solution(int a, int b) {
            int answer = 1;

            BigDecimal dec_a = new BigDecimal(a);
            BigDecimal dec_b = new BigDecimal(b);

            try {
                dec_a.divide(dec_b);
            } catch (Exception e) {

                answer = 2;
            }

            return answer;
        }
    }

}
// 다른사람 풀이

// 이게 알고리즘 풀이 알맞은 방식인듯.
//class Solution {
//
//    public static void main(String[] args) {
//
//        Solution solution = new Solution();
//
//
//        System.out.println(solution.solution(12, 24));
//    }
//
//    public int solution(int a, int b) {
//        int answer = 0;
//
//        for (;b%2 == 0;) {
//            b = b/2;
//        }
//        for (;b%5 == 0;) {
//            b = b/5;
//        }
//
//        if ((a/(double)b)%1 == 0) {
//            answer = 1;
//        } else {
//            answer = 2;
//        }
//
//        return answer;
//    }
//
//}
