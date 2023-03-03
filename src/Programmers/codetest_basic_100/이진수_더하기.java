package Programmers.codetest_basic_100;

public class 이진수_더하기 {

    public static void main(String[] args) {

        String bin1 = "10";
        String bin2 = "11";

        Solution solution = new Solution();

        System.out.println(solution.solution(bin1, bin2));

    }

    static class Solution {
        public String solution(String bin1, String bin2) {
            String answer = "";

            int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);

            answer = Integer.toBinaryString(sum);

            return answer;
        }
    }
}

// 다른사람 풀이

// class Solution {
//    public String solution(String bin1, String bin2) {
//        return Integer.toString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2),2);
//    }
//}
