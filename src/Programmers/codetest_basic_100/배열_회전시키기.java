package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 배열_회전시키기 {

    public static void main(String[] args) {

//        int[] number = {1,2,3};
        //        String direction = "right";
        int[] number = {4, 455, 6, 4, -1, 45, 6};
                String direction = "left";



        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(number, direction)));

    }

    static class Solution {
        public int[] solution(int[] numbers, String direction) {

            int[] answer = new int[numbers.length];

            if (direction.equals("right")) {

                answer[0] = numbers[numbers.length-1];

                for (int i = 0; i < numbers.length-1; i++) {

                    answer[i+1] = numbers[i];
                }
            } else if (direction.equals("left")) {

                answer[numbers.length-1] = numbers[0];

                for (int i = 0; i < numbers.length-1; i++) {

                    answer[i] = numbers[i+1];
                }

            }

            return answer;
        }
    }
}

// 다른사람 풀이
// for문 안쓰고 하는 방식인듯?

//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Collectors;
//
//class Solution {
//    public int[] solution(int[] numbers, String direction) {
//        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
//
//        if (direction.equals("right")) {
//            list.add(0, list.get(list.size() - 1));
//            list.remove(list.size() - 1);
//        } else {
//            list.add(list.size(), list.get(0));
//            list.remove(0);
//        }
//        return list.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
