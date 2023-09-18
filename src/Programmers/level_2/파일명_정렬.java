package Programmers.level_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 파일명_정렬 {


    public static void main(String[] args) {

        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(files)));
    }

    static class Solution {
        public String[] solution(String[] files) {
            String[] answer = new String[files.length];

            Map<String, Integer> files_sort_recode = new HashMap<>();

            // 좀더 빨리하기 위해 같은 이름일경우 숫자 저장하기
            Map<String, Integer> number = new HashMap<>();

            for (String s : files) {

                s = s.toUpperCase();

                char[] ch_arr = s.toCharArray();

                int sum = 0;
                int head_idx = 0;

                for (int ch : ch_arr) {

                    if (ch >= 32 && ch <= 57 ) {

                        head_idx ++;
                        sum += ch;
                    } else {

                        break;
                    }
                }

                String head = s.substring(0, head_idx);

                number.put(head, sum);







            }


            return answer;
        }
    }
}
