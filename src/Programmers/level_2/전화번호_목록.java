package Programmers.level_2;


import java.util.HashMap;
import java.util.Map;

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

            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < phone_book.length; i++) {

                map.put(phone_book[i], i);
            }

            for (int i = 0; i < phone_book.length; i++) {

                for (int j = 0; j < phone_book[i].length(); j++) {

                    if (map.containsKey(phone_book[i].substring(0,j)))
                        return false;
                }
            }

            return answer;
        }
    }
}
