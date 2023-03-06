package Programmers.codetest_basic_100;

// 머리 아프길레 잠깐 한줄짜리? 풀이라고 있길레 봤는데 왜 작은 길이*2 -1 인지 설명해줌
import java.util.Arrays;

public class 삼각형의_완성조건_2_check {

    public static void main(String[] args) {

        int[] sids = {1,2};

        Solution solution = new Solution();

        System.out.println(solution.solution(sids));

    }

    static class Solution {
        public int solution(int[] sides) {
            int answer = 0;

            answer = Arrays.stream(sides).min().getAsInt() * 2 - 1;

            return answer;
        }
    }
}
// 다른사람 풀이
// 노가다 했으면 이런 형식으로 했을듯?
//class Solution {
//    public int solution(int[] sides) {
//        int answer = 0;
//        // 주어진 수 중 최대가 있는 경우
//        int shorter = Math.min(sides[0], sides[1]);
//        int longer = Math.max(sides[0], sides[1]);
//        for (int other = 1; other <= longer; ++other) {
//            if (longer < shorter + other) {
//                ++answer;
//            }
//        }
//        // 다른 수가 최대인 경우
//        for (int other = longer + 1; other < shorter + longer; ++other) {
//            ++answer;
//        }
//        return answer;
//    }
//}
