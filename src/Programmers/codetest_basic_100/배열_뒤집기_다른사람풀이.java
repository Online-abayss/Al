package Programmers.codetest_basic_100;


import java.util.ArrayList;
import java.util.List;

public class 배열_뒤집기_다른사람풀이 {

    public static void main(String[] args) {

        int[] num_list = {1,2,3,4,5};

        Solution solution = new Solution();

        System.out.println(solution.solution(num_list));

    }

    static class Solution {
        public List solution(int[] num_list) {

            List<Integer> answer = new ArrayList<>();

            for (int i = num_list.length-1 ; i >= 0; i--) {

                answer.add(num_list[i]);
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.Collections;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.Arrays;
//
//class Solution {
//    public int[] solution(int[] numList) {
//        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
//
//        Collections.reverse(list);
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//}


//이게 보편적
//class Solution {
//    public int[] solution(int[] num_list) {
//        int[] answer = new int[num_list.length];
//        for(int i = 0; i< num_list.length; i++){
//            answer[i] = num_list[num_list.length-i-1];
//        }
//        return answer;
//    }
//}
