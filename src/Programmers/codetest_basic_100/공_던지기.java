package Programmers.codetest_basic_100;

public class 공_던지기 {

    public static void main(String[] args) {

        int[]number = {1,2,3,4};
        int k = 2;

        Solution solution = new Solution();

        System.out.println(solution.solution(number, k));

    }

    static class Solution {
        public int solution(int[] numbers, int k) {
            int answer = 0;

            answer = numbers[(k-1) * 2 % numbers.length];

            return answer;
        }
    }
}
// 잘 몰랐음... 뭔가 쉽게 풀 공식이 있을 거 같아서 찾아봄

// x번째로 던져진 지점이 아니라 던진 사람이기 때문에 k - 1을 해주고, 한 사람씩 건너뛰므로 2를 곱해준 값을 배열의 크기로 나눈 index의 숫자가 답.
// 나머지 연산자로 해당 배열의 길이가 넘었을 경우, 나눠 나머지값으로 다음에 위치할 인덱스 값이 나온다
