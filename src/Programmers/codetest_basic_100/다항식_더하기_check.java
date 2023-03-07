package Programmers.codetest_basic_100;


// 나만의 식으로 풀다가 해결하려다가 꼬여서 결국 인터넷의 도움으로 해결.
public class 다항식_더하기_check {

    public static void main(String[] args) {

        String polynomial = "12x + 7 + x";

        Solution solution = new Solution();

        System.out.println(solution.solution(polynomial));

    }

    static class Solution {
        public String solution(String polynomial) {
            String answer = "";

            String[] arr = polynomial.split(" ");

            int sum_x = 0;
            int sum_num = 0;

            for (String s : arr) {

                // 인덱스에 x가 존재하는지
                if (s.equals("x")) {

                    sum_x += 1;
                    // 111x의 111을 얻어내기
                } else if (s.contains("x")) {

                    sum_x += Integer.parseInt(s.substring(0, s.length() - 1));
                // 상수만 구하기
                } else if (!s.equals("+")) {

                    sum_num += Integer.parseInt(s);
                }
            }

            // x의 관한 것들
            if (sum_x != 0 && sum_num ==0) {
                if (sum_x == 1) {

                    answer = "x";
                } else {

                    answer = sum_x + "x";
                }
            }

            if (sum_x != 0 && sum_num != 0) {

                if (sum_x == 1) {

                    answer = "x" + " + " + sum_num;
                } else {

                    answer = sum_x + "x" + " + " + sum_num;
                }
            }

            if (sum_x == 0 && sum_num != 0) {

                answer = String.valueOf(sum_num);
            }

            return answer;
        }
    }
}
