package Programmers.codetest_basic_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


public class 약수_구하기 {

    public static void main(String[] args) {

        int n = 24;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));

    }

    static class Solution {
        public int[] solution(int n) {

            ArrayList<Integer> test = new ArrayList<>();

            for (int i = 1; i< Math.sqrt(n) ; i++) {

                if ( n % i == 0) {

                    test.add(i);
                    test.add(n/i);
                }

            }
            Collections.sort(test);

            return test.stream().mapToInt(x -> x).toArray();

        }

    }

}


// 다른사람 풀이

//import java.util.stream.IntStream;
//        import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int n) {
//        return IntStream.rangeClosed(1, n).filter(i -> n % i == 0).toArray();
//    }
//}
