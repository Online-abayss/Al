package Programmers.codetest_basic_100;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 가장_큰_수_찾기 {

    public static void main(String[] args) {

        int[] array = {1, 8, 3};

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(array)));

    }


    static class Solution {
        public int[] solution(int[] array) {
            int[] answer = new int[2];

            answer[0] = Arrays.stream(array).max().getAsInt();

            for (int i = 0; i < array.length; i++) {

                if (answer[0] == array[i]) {

                    answer[1] = i;
                }
            }

            return answer;
        }
    }

}

// 다른사람 풀이
// 포문 쓰는거 말고 그냥 한줄로 쓸 방법이 있을거 같아서 indexOf로 할려 했으나 결과값이 4가 나온다. 이부분은 모르겠다. 리스트로 하고싶지는 않았음.
// 머리속으로 처음 스트림 문장 간단하게 써봄.

//import java.util.*;
//        import java.util.stream.Collectors;
//
//class Solution {
//    public int[] solution(int[] array) {
//        List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
//        int max = list.stream().max(Integer::compareTo).orElse(0);
//        int index = list.indexOf(max);
//        return new int[] {max, index};
//    }
//}
