package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 자릿수_더하기 {

    public static void main(String[] args) {

        int n = 1234;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }


    static class Solution {
        public int solution(int n) {
            int answer = 0;

            String str_num = String.valueOf(n);

            for (int i =0; i<str_num.length(); i++) {

                answer += Integer.parseInt(String.valueOf(str_num.charAt(i)));

            }

            return answer;
        }
    }
}

// 다른사람 풀이


//class Solution {
//    public int solution(int n) {
//        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).sum();
//    }
//}

// 이게 정석인듯?
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        while(n>0){
//            answer+=n%10;
//            n/=10;
//        }
//
//        return answer;
//    }
//}
