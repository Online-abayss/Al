package Programmers.codetest_basic_100;

import java.util.HashMap;

public class 모스부호_1 {

    public static void main(String[] args) {

        String letter = ".... . .-.. .-.. ---";

        Solution solution = new Solution();

        System.out.println(solution.solution(letter));

    }

    static class Solution {
        public String solution(String letter) {
            String answer = "";

            String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

            String[] arr_str = letter.split(" ");

            for (String s : arr_str) {

                for (int i = 0 ; i < morse.length; i++) {

                    if (s.equals(morse[i])) {

                        answer += (char)(97 + i);
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
