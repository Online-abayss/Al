package Programmers.level_1;

public class 나머지가_1이_되는_수_찾기 {

    public static void main(String[] args) {

        int n = 10;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 1;

            while (true) {

                if (n % answer == 1) {

                    break;
                }
                answer++;
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.stream.IntStream;
//
//class Solution {
//    public int solution(int n) {
//        return IntStream.range(2, n).filter(i -> n % i == 1).findFirst().orElse(0);
//    }
//}
