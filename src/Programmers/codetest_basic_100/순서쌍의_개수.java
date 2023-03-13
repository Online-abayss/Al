package Programmers.codetest_basic_100;

public class 순서쌍의_개수 {

    public static void main(String[] args) {

        int n = 20;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int cnt = 0;

            int a = 1;

            while (a <= Math.sqrt(n)){

                if (n % a == 0) {

                    answer += 1;
                }
                if (a * a == n) {

                    cnt += 1;
                }
                a++;
            }

            return (2*answer) - cnt;
        }
    }

}

// 다른사람 풀이

//import java.util.stream.IntStream;
//
//class Solution {
//    public int solution(int n) {
//        return (int) IntStream.rangeClosed(1, n).filter(i -> n % i == 0).count();
//    }
//}

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        for(int i = 1; i <= n; i++){
//            if(n % i == 0){
//                answer++;
//            }
//        }
//        return answer;
//    }
//}
