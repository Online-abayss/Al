package Programmers.codetest_basic_100;

// 다른사람풀이 재귀함수 3c2 형식으로 푼거다.. 내가 푼건 크기의 문제인지 실패햇다.
public class 구슬을_나누는_경우의_수_check {

    public static void main(String[] args) {

        int balls = 30;
        int share = 15;

        Solution solution = new Solution();

        System.out.println(solution.solution(balls, share));


    }

    static class Solution {

        public int solution(int balls, int share) {
            return combination(balls, share);
        }

        public static int combination(int balls, int share) {
            if (balls == share || share == 0) return 1;
            return combination((balls - 1), (share - 1)) + combination(balls - 1, share);
        }

    }
}




//    static class Solution {
//        public Long solution(int balls, int share) {
//
//            Long answer = 0L;
//
//            answer = pactorial(balls) / (pactorial(balls - share) * pactorial(share));
//
//            return answer;
//        }
//
//        public Long pactorial(int num) {
//
//            Long result = 1L;
//
//            if (num == 0  || num ==1) {
//
//                return result;
//            }
//
//            for (int i = num; i > 0; i--){
//
//                result *= i;
//            }
//
//            return result;
//        }
//    }
//}
