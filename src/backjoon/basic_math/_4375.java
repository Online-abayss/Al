package backjoon.basic_math;


import java.util.Scanner;

public class _4375 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int num = sc.nextInt();
            int prev = 0;
            for(int i = 1;;i++){
                prev = (prev*10+1)%num;
                if(prev == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
