package Programmers.level_2;

public class 다음_큰_숫자 {

    public static void main(String[] args) {

        int n = 78;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            String binary_number = Integer.toBinaryString(n);
            char[] numbers = binary_number.toCharArray();

            int cnt = 0;
            for (char a : numbers) {

                if (a == '1') {

                    cnt += 1;

                }

            }

            for (int i = n +1; ; i++) {

                String s = Integer.toBinaryString(i);
                char[] char_arr = s.toCharArray();
                int count = 0;
                for (char b : char_arr) {

                    if (b == '1') {

                        count += 1;
                    }
                }

                if (cnt == count) {

                    return i;
                }
            }

        }
    }
}
