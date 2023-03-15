package Programmers.codetest_basic_100;

public class 문자_반복_출력하기 {

    public static void main(String[] args) {

        String my_string = "hello";
        int n = 3;

        Solution solution = new Solution();

        System.out.println(solution.solution(my_string, n));

    }

    static class Solution {
        public String solution(String my_string, int n) {
            String answer = "";

            String[] arr_str = my_string.split("");

            for (String s : arr_str) {

                for (int i = 0 ; i < n; i++) {

                    answer += s;
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public String solution(String my_string, int n) {
//        String answer = "";
//        String[] str = my_string.split("");
//        for(int i=0; i<my_string.length(); i++){
//            answer += str[i].repeat(n);
//        }
//        return answer;
//    }
//}
