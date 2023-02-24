package Programmers.codetest_basic_100;

class 제곱수_판별하기 {

    public static void main(String[] args) {

        int n = 976;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 2;

            double sqrt_num = Math.sqrt(n);

            if ((int) sqrt_num * sqrt_num == sqrt_num * sqrt_num ) {

                answer = 1;
            }

            return answer;
        }
    }
}


// 다른사람 풀이
// 아 나머지가 0이면 이렇게 처리하면 되는걸 몰랐음 ㅋㅋㅋㅋㅋㅋ

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        return Math.sqrt(n) % 1 == 0 ? 1 : 2;
//    }
//}
