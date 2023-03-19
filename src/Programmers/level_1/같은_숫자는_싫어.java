package Programmers.level_1;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1};

        Solution solution = new Solution();

        System.out.println(solution.solution(arr));

    }

    static public class Solution {
        public List<Integer> solution(int []arr) {

            List<Integer> num_lst = new ArrayList<>();

            num_lst.add(arr[0]);

            for (int i = 1; i < arr.length; i++) {

                if (arr[i] != arr[i-1]) {

                    num_lst.add(arr[i]);
                }
            }

            return num_lst;

        }
    }
}

// 다른사람 풀이

//import java.util.*;
//
//public class Solution {
//    public int[] solution(int []arr) {
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//        int preNum = 10;
//        for(int num : arr) {
//            if(preNum != num)
//                tempList.add(num);
//            preNum = num;
//        }
//        int[] answer = new int[tempList.size()];
//        for(int i=0; i<answer.length; i++) {
//            answer[i] = tempList.get(i).intValue();
//        }
//        return answer;
//    }
//}
