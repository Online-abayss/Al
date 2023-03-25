package Programmers.level_1;

import java.util.ArrayList;
import java.util.List;

// 스택으로 풀면 속도가 더 빠르다.
public class 햄버거_만들기_check {

    public static void main(String[] args) {

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
//        int[] ingredient = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1,2,3,1};

        Solution solution = new Solution();

        System.out.println(solution.solution(ingredient));
    }

    static class Solution {
        public int solution(int[] ingredient) {
            int answer = 0;

            List<Integer> berger_lst = new ArrayList<>();

            for (int a : ingredient) {

                berger_lst.add(a);

                if (berger_lst.size() > 3) {

                    if (berger_lst.get(berger_lst.size()- 4) == 1 &&
                            berger_lst.get(berger_lst.size()- 3) == 2 &&
                            berger_lst.get(berger_lst.size()- 2) == 3 &&
                            berger_lst.get(berger_lst.size()- 1) == 1) {

                        answer ++;

                        berger_lst.remove(berger_lst.size()- 1);
                        berger_lst.remove(berger_lst.size()- 1);
                        berger_lst.remove(berger_lst.size()- 1);
                        berger_lst.remove(berger_lst.size()- 1);

                    }
                }
            }

            return answer;
        }
    }
}



            // 시간초과.
//            int j = 0;
//
////            List<Integer> test = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
//            List<Integer> integerList = new ArrayList<>();
//
//            for (int a : ingredient) {
//
//                integerList.add(a);
//            }
//
//            List<Integer> match_num_list = new ArrayList<>();
//            match_num_list.add(1);
//            match_num_list.add(2);
//            match_num_list.add(3);
//            match_num_list.add(1);
//
//            while (j < integerList.size()) {
//
//                if (j + 4 > integerList.size()) {
//
//                    break;
//                } else if (integerList.subList(j, j+4).equals(match_num_list)) {
//                answer += 1;
//                integerList.remove(j);
//                integerList.remove(j);
//                integerList.remove(j);
//                integerList.remove(j);
//                j = -1;
//                }
//                j++;
//            }
