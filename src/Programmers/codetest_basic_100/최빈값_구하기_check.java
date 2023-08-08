//package Programmers.codetest_basic_100;
//
//import java.util.*;
//
//public class 최빈값_구하기_check {
//
//    public static void main(String[] args) {
//
////        int[] array = {1,2,3,3,3,4};
//
////        int[] array = {1,1,2,2};
//
//        int[] array = {1,1};
//
//        Solution solution = new Solution();
//
//        System.out.println(solution.solution(array));
//
//    }
//
//    static class Solution {
//        public int solution(int[] array) {
//            int answer = 0;
//            List<Integer> integerList = new ArrayList<>();
//
//            int n = 1000; // array에 있는 원소의 범위가 0<= n < 1000 이라서 1000으로 잡고 모든 리스트 배열에 0을 집어넣음
//            while (n > 0) {
//
//                integerList.add(0);
//                n--;
//            }
//
//            int cnt = 0;
//            Arrays.sort(array); // 초기값들을 위에 모아두면 좋지만, 일단 내가 푸는데 이해하기 위해서 편의상 이리둠.
//                                // 배열을 정렬하여 작은것부터 하나씩 처리함.
//
//            if (array.length == 1) { // 배열 1개 일 때 처리
//
//                answer = array[0];
//            } else { // 배열 여러개 일 때 array 원소에 있는 그 숫자가 0 이면 +1, 0이 아니면 +1씩 더 해서 카운팅함.
//
//                for (int i = 0; i < array.length; i++) {
//
//
//                    if (integerList.get(array[i]) == 0) {
//
//                        cnt = 1;
//
//                        integerList.set(array[i], cnt);
//                    } else {
//
//                        cnt++;
//
//                        integerList.set(array[i], cnt);
//                    }
//                }
//
//                List<Integer> abc = new ArrayList<>(integerList);
//
//                Collections.sort(abc, Comparator.reverseOrder());
//
//                if (abc.get(0) == abc.get(1)) { // 위에 비교할 리스트들 따로 하나 생성하여, 역정렬하여, 동일 갯수가 나오면 -1 처리
//
//                    answer = -1;
//                } else { // 아닐 시 그 갯수가 포함된 intergerList에서 인덱스 찾기. ( 인덱스가 곧 해당 숫자로 처리하도록 코드 짬)
//
//                    answer = integerList.indexOf(abc.get(0));
//
//                }
//            }
//            return answer;
//        }
//    }
//}
//
//// 다른사람 풀이
//
//// 이게 더 빠름.... 2초나
//
////import java.util.*;
////class Solution {
////    public int solution(int[] array) {
////        int maxCount = 0;
////        int answer = 0;
////
////        Map<Integer, Integer> map = new HashMap<>();
////
////        // getOrDefault : 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본 값을 반환하는 메서드
////        // getPrDefault(Object key, V DefaultValue)
////        // 매개변수 : 이 메서드는 두개의 매개변수를 허용
////        // key : 값을 가져와야 하는 요소의 키
////        // defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값
////        // 반환값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지 않으면 디폴트 값이 반환
////
////        for(int number : array) {
////            int count = map.getOrDefault(number, 0) + 1;
////
////            if(count > maxCount) {
////                maxCount = count;
////                answer = number;
////            }
////
////            else if(count == maxCount) {
////                answer = -1;
////            }
////
////            map.put(number, count);
////        }
////
////        return answer;
////    }
////}


package Programmers.codetest_basic_100;

import java.util.*;

public class 최빈값_구하기_check {

    public static void main(String[] args) {

        int[] array = {1,2,3,3,3,4};

        Solution solution = new Solution();

        System.out.println(solution.solution(array));

    }

    static class Solution {
        public int solution(int[] array) {
            int answer = 0;
            int max = 0;

            HashMap<Integer, Integer> test = new HashMap<>();

            for (int a : array) {

                test.put(a, test.getOrDefault(a, 0) + 1);
            }


            return answer;
        }
    }
}
