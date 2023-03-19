package Programmers.level_1;


import java.util.Arrays;
import java.util.Comparator;


public class 문자열_내_마음대로_정렬하기_check {

    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};

//        String[] strings = {"abce", "abcd", "cdx"};
        int n = 1;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(strings, n)));


    }

    static class Solution {
        public String[] solution(String[] strings, int n) {


            Arrays.sort(strings, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {

                    if (o1.charAt(n) > o2.charAt(n)) {

                        return 1;
                    } else if (o1.charAt(n) < o2.charAt(n)) {

                        return -1;
                    } else {

                        return o1.compareTo(o2);

                    }

                }
            });

            return strings;
        }
    }

}

// 다른사람 풀이

//import java.util.*;
//
// 비교군을 맨앞에다가 두고 sort시켜서 다시 substring으로 인덱스 1부터 집어넣음.
//class Solution {
//    public String[] solution(String[] strings, int n) {
//        String[] answer = {};
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < strings.length; i++) {
//            arr.add("" + strings[i].charAt(n) + strings[i]);
//        }
//        Collections.sort(arr);
//        answer = new String[arr.size()];
//        for (int i = 0; i < arr.size(); i++) {
//            answer[i] = arr.get(i).substring(1, arr.get(i).length());
//        }
//        return answer;
//    }
//}
