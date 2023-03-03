package Programmers.codetest_basic_100;

import java.util.Arrays;

public class 치킨_쿠폰 {


    public static void main(String[] args) {

        int chicken = 1999;

        Solution solution = new Solution();

        System.out.println(solution.solution(chicken));
    }


    static class Solution {
        public int solution(int chicken) {

            int coupon = chicken;
            int cnt = 0;

            while (coupon >= 10) {

                int restCoupon = coupon % 10;
                cnt += coupon / 10;
                coupon = restCoupon + coupon / 10;

            }
            return cnt;
        }
    }
}
