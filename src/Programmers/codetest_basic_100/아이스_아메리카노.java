package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 아이스_아메리카노 {

    public static void main(String[] args) {

        int money = 5500;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(money)));

    }

    static class Solution {
        public int[] solution(int money) {
            int[] answer = new int[2];

            answer[0] = money / 5500;
            answer[1] = money % 5500;

            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public int[] solution(int money) {
//        return new int[] { money / 5500, money % 5500 };
//    }
//}
