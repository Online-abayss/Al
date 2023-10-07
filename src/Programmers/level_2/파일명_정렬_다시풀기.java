package Programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명_정렬_다시풀기 {


    public static void main(String[] args) {

        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(files)));
    }


    static class Solution {
        public String[] solution(String[] files) {
            String[] answer = {};

            Arrays.sort(files, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {





                    return 0;
                }
            });


            return answer;
        }
    }
}
