package Programmers.codetest_basic_100;

public class 옷가게_할인_받기 {

    public static void main(String[] args) {

        int price = 580000;

        Solution solution = new Solution();

        System.out.println(solution.solution(price));

    }

    static class Solution {
        public int solution(int price) {

            int discount_price = 100000;

            if (price >= discount_price * 5) {

                price *= 0.8;
            } else if (price >= discount_price * 3) {

                price *= 0.9;
            } else if (price >= discount_price) {

                price *= 0.95;
            }

            return price;
        }
    }
}
