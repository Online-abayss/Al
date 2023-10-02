package Programmers.level_2;


import java.util.Arrays;

public class k진수에서_소수_개수_구하기_다시풀기 {


    public static void main(String[] args) {

        int n  = 110011;
        int k = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n, k));

    }


//    static class Solution {
//
//        public int solution(int n, int k) {
//            int answer = 0;
//            String num = Integer.toString(n, k);
//            String[] num_array = num.split("0");
//
//            for(String s:num_array){
//                if(s.equals("")) continue;
//                long number = Long.parseLong(s);
//                if(isPrime(number)){
//                    answer++;
//                }
//            }
//            return answer;
//        }
//
//        public static boolean isPrime(long num){
//            if(num == 1){
//                return false;
//            }
//
//            if(num == 2) return true;
//
//            for(int i=2;i<=(int)Math.sqrt(num);i++){
//                if(num % i == 0){
//                    return false;
//                }
//            }
//            return true;
//        }
//
//
//    }

    static class Solution {
        public int solution(int n, int k) {
            int answer = 0;

            String number_bit = Integer.toString(n, k);

            String[] numbers_arr = number_bit.split("0");

            for (int i = 0; i < numbers_arr.length; i++) {

                if (numbers_arr[i].equals("")) {

                    continue;
                }
                if(check_prime(numbers_arr[i])) {

                    answer ++;
                }
            }


            return answer;
        }

        public static boolean check_prime(String s) {

            long n = Long.parseLong(s);

            if (n == 1) {

                return false;
            } else if (n == 2) {

                return true;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {

                if (n % i == 0) {

                    return false;
                }
            }

            return true;
        }
    }

}
