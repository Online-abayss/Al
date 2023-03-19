package Programmers.level_1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class 폰켓몬 {

    public static void main(String[] args) {

        int[] nums = {3,1,2,3};

        Solution solution= new Solution();

        System.out.println(solution.solution(nums));


    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            HashSet<Integer> nums_set = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));

            answer = Math.min(nums.length / 2, nums_set.size());

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.HashSet;
//
//class Solution {
//    public int solution(int[] nums) {
//
//            HashSet<Integer> hs = new HashSet<>();
//
//            for(int i =0; i<nums.length;i++) {
//                hs.add(nums[i]);
//            }
//
//            if(hs.size()>nums.length/2)
//                return nums.length/2;
//
//            return hs.size();
//    }
//}
