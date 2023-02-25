package Programmers.codetest_basic_100;

import java.util.*;

class 배열의_유사도 {

    public static void main(String[] args) {

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        Solution solution = new Solution();

        System.out.println(solution.solution(s1, s2));

    }

    static class Solution {
        public int solution(String[] s1, String[] s2) {
            int answer = 0;

            for (int i =0; i<s1.length; i++) {


                for (int j =0; j<s2.length; j++) {

                    if (s1[i].equals(s2[j])) {

                        answer ++;
                    }
                }
            }

            return answer;
        }
    }

}

// 다른사람 풀이

// 난 2중 for문을 쓰기 싫었다. 하지만 생각이 안난다... 이리 저리 해봐도

// set을 기반으로 중첩을 자동으로 없애는걸 사용하는 법 ... 좋다... 진짜 좋다.
//        import java.util.HashSet;
//        import java.util.List;
//class Solution {
//
//    public int solution(String[] s1, String[] s2) {
//        int answer = 0;
//        HashSet<String> set = new HashSet<>(List.of(s1));
//        for (String s : s2) {
//            if(set.contains(s)){
//                answer++;
//            }
//        }
//        return answer;
//    }
//}


// stream 쓴다면 이게 베스트 인거 같다. 다만 쓰질 않아서 익숙하지 않는거 같다.
//        import java.util.*;
//class Solution {
//    public int solution(String[] s1, String[] s2) {
//        Set<String> set = new HashSet<>(Arrays.asList(s1));
//        return (int)Arrays.stream(s2).filter(set::contains).count();
//    }
//}
