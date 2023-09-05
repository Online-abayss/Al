package Programmers.level_2;



public class 전화번호_목록 {

    public static void main(String[] args) {

//        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        String[] phone_book = {"123","1005","1006","1007"};


        Solution solution = new Solution();

        System.out.println(solution.solution(phone_book));

    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            boolean answer = true;

            String[] check_words = phone_book[0].split("");

            for (int i = 1; i < phone_book.length; i++) {

                String[] words = phone_book[i].split("");
                int cnt = 0;
                for (String s : words) {

                    for (String x : check_words) {

                        if (s.equals(x)) {

                            cnt ++;
                        }
                        if (cnt == check_words.length) {

                            return false;
                        }
                    }
                }
            }

            return answer;
        }
    }
}
