package Programmers.codetest_basic_100;

public class 짝수의_합 {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            while (n > 0) {

                if (n % 2 == 0) {

                    answer += n;
                }

                n --;
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        for(int i=2; i<=n; i+=2){
//            answer+=i;
//        }
//
//        return answer;
//    }
//}

//import java.util.stream.IntStream;
//class Solution {
//    public int solution(int n) {
//        return IntStream.rangeClosed(0, n)
//            .filter(e -> e % 2 == 0)
//            .sum();
//    }
//}
