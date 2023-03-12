package Programmers.codetest_basic_100;

public class 가위_바위_보 {

    public static void main(String[] args) {

        String rsp = "205";

        Solution solution = new Solution();

        System.out.println(solution.solution(rsp));

    }

    static class Solution {
        public String solution(String rsp) {
            String answer = "";

            String[] arr_str = rsp.split("");

            for (String s : arr_str) {

                if (s.equals("2")) {

                    answer += "0";
                } else if (s.equals("0")) {

                    answer += "5";
                } else if (s.equals("5")) {

                    answer += "2";
                }
            }

            return answer;
        }
    }
}
