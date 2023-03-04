package Programmers.codetest_basic_100;


// 내 수식이 어디서 틀렸는지 원하는 답이 하나씩 삑사리 나서 결국 인터넷 찾아봄.
public class 저주의_숫자_3_check {

    public static void main(String[] args) {

        int n = 15;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;


            while (n > 0) {

                answer ++;

                while (answer <= 1000) {

                    if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {

                        answer++;
                    } else {

                        break;
                    }
                }
                n --;
            }
            return answer;
        }
    }
}

// 다른사람 풀이

//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++) {
//            answer++;
//            if (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
//                i--;
//            }
//        }
//
//        return answer;
//    }
//}
