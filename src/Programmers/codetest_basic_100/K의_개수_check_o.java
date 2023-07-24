//package Programmers.codetest_basic_100;
//
//// 역대급으로 느린 실행문;; 440ms도 봄. 다른사람 풀이 보면서 반성해보자
//public class K의_개수_check_o {
//
//    public static void main(String[] args) {
//
//        int i = 10;
//        int j = 50;
//        int k = 5;
//
//        Solution solution = new Solution();
//
//        System.out.println(solution.solution(i, j, k));
//
//
//    }
//
//    static class Solution {
//        public int solution(int i, int j, int k) {
//            int answer = 0;
//
//            String str = "";
//
//            for (int t = i; t <= j; t++) {
//
//                 str += String.valueOf(t);
//            }
//            String[] arr_str = str.split("");
//
//            for (int t = 0; t < arr_str.length; t++) {
//
//                if (Integer.parseInt(arr_str[t]) == k) {
//
//                    answer ++;
//
//                }
//            }
//
//            return answer;
//        }
//    }
//}
//
//// 다른사람 풀이
//
////class Solution {
////    public int solution(int i, int j, int k) {
////        String str = "";
////        for(int a = i; a <= j; a++) {
////            str += a+"";
////        }
////
////        return str.length() - str.replace(k+"", "").length();
////    }
////}


package Programmers.codetest_basic_100;
public class K의_개수_check_o {

    public static void main(String[] args) {

        Solution solution = new Solution();

        System.out.println(solution.solution(1,13,1));


    }

    static class Solution {
        public int solution(int i, int j, int k) {
            int answer = 0;

            String s = "";

            for (int a = i; a <= j; a += k) {

                s += String.valueOf(a);
            }

            answer = s.length() - s.replace(String.valueOf(k), "").length();

            return answer;
        }
    }
}
