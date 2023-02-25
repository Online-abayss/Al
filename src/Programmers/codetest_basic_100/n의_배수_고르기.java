package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class n의_배수_고르기 {

    public static void main(String[] args) {

        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(n, numlist)));

    }

    static class Solution {
        public int[] solution(int n, int[] numlist) {

            List<Integer> test = new ArrayList();

            for (int i = 0; i<numlist.length; i++) {

                  if (numlist[i] % n == 0) {

                      test.add(numlist[i]);
                  }
            }

            int[] answer = new int[test.size()];

            for (int i = 0; i<test.size(); i++ ) {

                answer[i] = test.get(i);
            }


            return answer;
        }
    }

}

// 다른사람 풀이법

//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int n, int[] numList) {
//        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
//    }
//}


//이게 내가 했던 방식이랑 유사한 스트림
//import java.util.List;
//import java.util.ArrayList;
//
//class Solution {
//    public int[] solution(int n, int[] numlist) {
//        List<Integer> answer = new ArrayList<>();
//        for(int num : numlist){
//            if(num % n == 0){
//                answer.add(num);
//            }
//        }
//        return answer.stream().mapToInt(x -> x).toArray();
//    }
//}
