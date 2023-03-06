package Programmers.codetest_basic_100;


public class 외계어_사전 {

    public static void main(String[] args) {

        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod" , "eocd", "qixm", "adio", "soo",};

        Solution solution = new Solution();

        System.out.println(solution.solution(spell, dic));

    }

    static class Solution {
        public int solution(String[] spell, String[] dic) {
            int answer = 2;

            for (int i = 0; i < dic.length; i++) {

                int cnt = 0;

                for (int j = 0; j < spell.length; j++) {

                    if (!dic[i].contains(spell[j])) {

                        continue;
                    } else {

                        cnt ++;
                    }
                }

                if (cnt == spell.length) {

                    answer = 1;
                }
            }
            return answer;
        }
    }

}

// 다른사람 풀이

// 이중 포문 아닌 버전! 내가 원하던 버전.
//import java.util.*;
//
//class Solution {
//    public int solution(String[] spell, String[] dic) {
//        Arrays.sort(spell);
//
//        for (String d : dic) {
//            String[] dSplit = d.split("");
//            Arrays.sort(dSplit);
//
//            if (Arrays.equals(dSplit, spell)) {
//                return 1;
//            }
//        }
//
//        return 2;
//    }
//}
