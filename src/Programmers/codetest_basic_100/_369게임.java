package Programmers.codetest_basic_100;

public class _369게임 {

    public static void main(String[] args) {

        int order = 123456;

        Solution solution = new Solution();

        System.out.println(solution.solution(order));

    }

    static class Solution {
        public int solution(int order) {
            int answer = 0;

            String str = String.valueOf(order);

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == '3' || str.charAt(i) == '6' || str.charAt(i) =='9') {

                    answer ++;
                }
            }
            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.Arrays;
//
//class Solution {
//    public int solution(int order) {
//        return (int) Arrays.stream(String.valueOf(order).split("")).map(Integer::parseInt).filter(i -> i == 3 || i == 6 || i == 9).count();
//    }
//}
