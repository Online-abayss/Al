package Programmers.level_1;


import java.util.Arrays;

// 내가 sort 안쓰고 내 스스로 풀려 했으나 어디서 계속 꼬여서 계속 답이 틀렸음... 결국 gg 치고 답변 봄... 생각보다 허무함..
// -1로 처리해버리면 된다는걸 놀람
public class 체육복_check {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};

//        int[] lost = {1,2,4,5};
//        int[] reserve = {2,3,4};

        Solution solution = new Solution();

        System.out.println(solution.solution(n, lost, reserve));

    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {

            int answer = n - lost.length;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            for (int i = 0; i < lost.length; i++) {

                for (int j = 0; j < reserve.length; j++) {

                    if(lost[i] == reserve[j]) {

                        answer++;
                        lost[i] = -1;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            for (int i = 0; i < lost.length; i++) {

                for (int j = 0; j < reserve.length; j++) {

                    if ((lost[i] -1 == reserve[j] || lost[i] +1 == reserve[j] )) {

                        answer++;
                        reserve[j] = -1;
                        break;
                    }
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

// 내가 하려던 풀이 방식. 이러면 sort도 필요가 없음.

// import java.util.HashSet;
//class Solution {
//    public int solution(int n, int[] lost, int[] reserve) {
//        int answer=n-lost.length;
//        HashSet<Integer> ko = new HashSet<Integer>();
//        for(int k : reserve) {
//            ko.add(k);
//        }
//        for(int i =0;i<lost.length;i++) {
//            if(ko.contains(lost[i])) {
//                //System.out.println("내껀내가입지");
//                answer++;
//                ko.remove(lost[i]);
//                lost[i]=-1;
//            }
//        }
//
//
//        for(int i =0;i<lost.length;i++) {
//            //System.out.println(i);
//
//            if(ko.contains(lost[i]-1)) {
//                //System.out.println("있다");
//                answer++;
//                ko.remove(lost[i]-1);
//            }else if(ko.contains(lost[i]+1)) {
//                //System.out.println("있다");
//                answer++;
//                ko.remove(lost[i]+1);
//            }
//            //System.out.println("없다");
//        }
//
//
//        return answer;
//    }
//}
