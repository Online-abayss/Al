package Programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 압축 {

    public static void main(String[] args) {

        String msg = "KAKAO";

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(msg)));

    }

    static class Solution {
        public int[] solution(String msg) {
            int[] answer = {};

            // 1.길이 1인 단어
            // 2.사전에 현재와 일치하는 가장 긴 문자열 w 찾기
            // 3.w에 해당하는 사전 번호 출력 후 입력에서 w 제거
            // 4.입력에 처리 안된 다음 글자가 있다면 c, w+ c에 해당하는 단어 사전에 등록
            // 5. 2로 재실행

            String[] alphabet = {"A" , "B" , "C" , "D" , "E" , "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            HashMap<String, Integer> dictionary = new HashMap<>();

            for (int i = 0; i < alphabet.length; i++) {

                dictionary.put(alphabet[i], i + 1);
            }

            ArrayList<Integer> test = new ArrayList<>();

            String[] msg_split = msg.split("");

            int start = 0;
            int end = 1;
            int cnt = 1;
            while (start < msg.length() && end <= msg.length()) {

                String s = msg.substring(start, end);
                if (dictionary.containsKey(s) ) {

                    test.add(dictionary.get(s));
                    dictionary.put(s, dictionary.size() + cnt);
                    cnt ++;
                    start = end;
                    end += 1;
                } else {

                    end ++;
                }
            }

            System.out.println(test);
            return answer;
        }
    }
}
