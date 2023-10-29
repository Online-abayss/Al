package Programmers.level_2;

import java.util.Arrays;
import java.util.Comparator;

public class 파일명_정렬_다시풀기 {


    public static void main(String[] args) {

        String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(files)));
    }


//    static class Solution {
//        public String[] solution(String[] files) {
//
//            Arrays.sort(files, new Comparator<String>() {
//                @Override
//                public int compare(String o1, String o2) {
//
//                    String head1 = o1.split("[0-9]")[0];
//                    String head2 = o2.split("[0-9]")[0];
//
//                    int result = head1.toLowerCase().compareTo(head2.toLowerCase());
//
//                    if (result == 0) {
//
//                        result = number(o1, head1) - number(o2, head2);
//                    }
//
//                    return result;
//                }
//            });
//
//            return files;
//        }
//
//        private int number(String o1, String head1) {
//
//            o1 = o1.substring(head1.length());
//
//            String word = "";
//
//            for (char c : o1.toCharArray()) {
//
//                if (Character.isDigit(c) && word.length() < 5) {
//
//                    word += c;
//                } else {
//
//                    break;
//                }
//            }
//
//            return Integer.parseInt(word);
//        }
//    }

    static class Solution {
        public String[] solution(String[] files) {
            String[] answer = {};


            return answer;
        }
    }
}
