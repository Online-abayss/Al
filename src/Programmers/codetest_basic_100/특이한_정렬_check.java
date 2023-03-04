package Programmers.codetest_basic_100;

import java.util.*;

// 처음에 map을 생각했다가 key값의 중첩이 안되는것에 이리 저리 하다가 포기... 다른사람들꺼 보면서 잘 배우기..
public class 특이한_정렬_check {

    public static void main(String[] args) {

        int[] numList = {1,2,3,4,5,6};
        int n = 4;

        Solution solution = new Solution();

        System.out.println(Arrays.toString(solution.solution(numList, n)));

    }



    static class Solution {
        public int[] solution(int[] numlist, int n) {
            int[] answer = {};

            List<Integer> nums = new ArrayList<>();

            Arrays.sort(numlist);

            for (int num : numlist) {

                nums.add(num);
            }
            nums.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
            Collections.reverse(nums);

            answer = nums.stream().mapToInt(a -> a).toArray();

            return answer;
        }
    }
}
