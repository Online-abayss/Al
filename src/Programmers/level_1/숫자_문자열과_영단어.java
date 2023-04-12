package Programmers.level_1;

public class 숫자_문자열과_영단어 {

    public static void main(String[] args) {

        String s = "one4seveneight";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }


    static class Solution {
        public int solution(String s) {
            int answer = 0;

            s = s.replaceAll("one", "1");
            s = s.replaceAll("two", "2");
            s = s.replaceAll("three", "3");
            s = s.replaceAll("four", "4");
            s = s.replaceAll("five", "5");
            s = s.replaceAll("six", "6");
            s = s.replaceAll("seven", "7");
            s = s.replaceAll("eight", "8");
            s = s.replaceAll("nine", "9");
            s = s.replaceAll("zero", "0");

            answer = Integer.parseInt(s);

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.*;
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        StringBuilder sb = new StringBuilder("");
//        int len = s.length();
//        String[] digits = {"0","1","2","3","4","5","6","7","8","9"};
//        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
//
//        for(int i=0; i<10; i++){
//            s = s.replaceAll(alphabets[i],digits[i]);
//        }
//
//        return Integer.parseInt(s);
//    }
//}
