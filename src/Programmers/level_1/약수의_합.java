package Programmers.level_1;

public class 약수의_합 {

    public static void main(String[] args) {

        int n = 12;

        Solution solution = new Solution();

        System.out.println(solution.solution(n));


    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            int i = n;

            while (i > 0) {

                if (n % i == 0) {

                    answer += i;
                }

                i--;
            }

            return answer;
        }
    }
}

// 다른사람 풀이

// 절반만 돌리는거 띵킹 좋다.

//class SumDivisor {
//    public int sumDivisor(int num) {
//        int answer = 0;
//    for(int i =1 ; i<=num/2;i++){
//      if(num%i==0){
//        answer+=i;}}
//
//
//        return answer+num;
//    }
//
//    // 아래는 테스트로 출력해 보기 위한 코드입니다.
//    public static void main(String[] args) {
//        SumDivisor c = new SumDivisor();
//        System.out.println(c.sumDivisor(12));
//    }
//}
