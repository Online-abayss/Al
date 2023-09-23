package Programmers.level_2;

public class _124_나라의_숫자 {


    public static void main(String[] args) {

        int n = 1234;
        Solution solution = new Solution();

        System.out.println(solution.solution(n));


    }
// 맨 마지막 숫자 = % 3  1  // 자리별 % 3 해서 찾으면 될듯.
    static class Solution {
        public String solution(int n) {

            String[] numbers = {"4", "1", "2"};
            String answer = "";

            int num = n;

            while(num > 0){
                int remainder = num % 3;
                num /= 3;

                if(remainder == 0) num--;

                answer = numbers[remainder] + answer;
            }

            return answer;
        }
    }

}
