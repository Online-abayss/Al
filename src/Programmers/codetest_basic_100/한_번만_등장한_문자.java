package Programmers.codetest_basic_100;

import java.util.*;

public class 한_번만_등장한_문자 {

    public static void main(String[] args) {

        String s = "abdc";

        Solution solution = new Solution();

        System.out.println(solution.solution(s));

    }

    static class Solution {
        public String solution(String s) {
            String answer = "";

            int cnt = 1;

            HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();

            HashSet<String> stringHashSet = new HashSet<>();

            stringIntegerHashMap.put(String.valueOf(s.charAt(0)), 1);
            stringHashSet.add(String.valueOf(s.charAt(0)));

            if (s.length() > 1) {

                for (int i = 1; i < s.length(); i ++) {

                    stringHashSet.add(String.valueOf(s.charAt(i)));

                    if (stringIntegerHashMap.containsKey(String.valueOf(s.charAt(i)))) {

                        cnt = stringIntegerHashMap.get(String.valueOf(s.charAt(i))); // 기존 value값 확인

                        stringIntegerHashMap.put(String.valueOf(s.charAt(i)), cnt + 1); // 기존 value값에 + 1

                    } else {

                        stringIntegerHashMap.put(String.valueOf(s.charAt(i)), 1);
                    }
                }
            }

            List<String> test_lst = new ArrayList<>(stringHashSet);
            Collections.sort(test_lst);
            for (int j = 0 ; j < stringHashSet.size(); j++ ) {


                if (stringIntegerHashMap.get(test_lst.get(j)) == 1) {

                    answer = answer + test_lst.get(j);
                }
            }

            return answer;
        }
    }
}

// 떠오르지 못했으며 개인적으로 어려웠음;
