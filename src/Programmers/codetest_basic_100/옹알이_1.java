package Programmers.codetest_basic_100;

class 옹알이_1 {
    public static void main(String[] args) {

        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};

        Solution solution = new Solution();

        System.out.println(solution.solution(babbling));

    }

    static class Solution {
        public int solution(String[] babbling) {

            int answer = 0;

            if (babbling.length <= 100) {

                for (int i = 0; i < babbling.length; i++) {

                    if (babbling[i].length() <= 15 ) {

                        String[] babbling_split = babbling[i].split("aya|ye|woo|ma");

                        if (babbling_split.length == 0) {

                            answer += 1;
                        }
                    }
                }
            }

            return answer;
        }
    }

}
