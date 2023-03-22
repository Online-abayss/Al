package Programmers.level_1;


public class 소수_만들기 {

    public static void main(String[] args) {

//        int[] nums = {1,3,7,2,9}; // 1,3,7 / 1,3,9 / 1,7,9 / 3,7,9
        int[] nums = {1,2,7,6,4};


        Solution solution = new Solution();

        System.out.println(solution.solution(nums));

    }

    static class Solution {
        public int solution(int[] nums) {

            int answer = 0;
            int sum = 0;

            for (int a = 0; a <= nums.length - 1; a++) {

                sum += nums[a];
            }

            int[] prime = new int[sum + 1];
            prime[0] = prime[1] = 1;

            for (int i = 2; i <= sum; i++) {

                if (prime[i] == 1) {

                    continue;
                }
                for (int j = 2 * i; j <= sum; j+= i) {

                    prime[j] = 1;
                }
            }

            for (int n = 0; n <nums.length -2; n++) {

                for (int m = n + 1; m< nums.length -1; m++) {

                    for (int o = m + 1; o < nums.length; o++) {

                        if (prime[(nums[n] + nums[m] + nums[o])] == 0) {

                            answer ++;

                        }
                    }
                }
            }

            return answer;
        }
    }
}

// 다른사람 풀이

//import java.util.Arrays;
//
//class Solution {
//
//
//
//    public int solution(int[] nums) {
//        int ans = 0;
//
//        for(int i = 0; i < nums.length - 2; i ++){
//            for(int j = i + 1; j < nums.length - 1; j ++){
//                for(int k = j + 1; k < nums.length; k ++ ){
//                    if(isPrime(nums[i] + nums[j] + nums[k])){
//                        ans += 1;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
//  // 이부분이 맘에 들었음.. 루트로 범위 좁혀서 거기서 num 값에서 나뉘어지면 cnt 해서 찾는거.
//    public Boolean isPrime(int num){
//        int cnt = 0;
//        for(int i = 1; i <= (int)Math.sqrt(num); i ++){
//            if(num % i == 0) cnt += 1;
//        }
//        return cnt == 1;
//    }
//}
