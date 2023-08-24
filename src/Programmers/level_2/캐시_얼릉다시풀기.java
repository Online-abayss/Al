package Programmers.level_2;

import java.util.LinkedList;

public class 캐시_얼릉다시풀기 {

    public static void main(String[] args) {

        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        Solution solution = new Solution();

        System.out.println(solution.solution(cacheSize, cities));

    }

    static class Solution {
        public int solution(int cacheSize, String[] cities) {
            int answer = 0;

            if (cacheSize == 0) {

                return  cities.length * 5;
            }

            LinkedList<String> test = new LinkedList<>();

            for (int i = 0; i < cities.length; i++) {

                String s = cities[i].toUpperCase();

                if (test.remove(s)) {

                    answer += 1;
                    test.add(s);
                } else {

                    answer += 5;
                    if (test.size() > cacheSize) {

                        test.remove(0);
                    }
                    test.add(s);
                }
            }

            
            return answer;
        }
    }
}
