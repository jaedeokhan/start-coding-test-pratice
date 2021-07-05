package coding.section02.E05_소수_에라토스테네스_체;

import java.util.Arrays;
import java.util.Scanner;

public class Main_A2_에라토스테네스_체 {

    public int solution(int num){

        int answer = 0;
        int[] check = new int[num+1];

        for (int i = 2; i <= num; i++){
            if (check[i] == 0){
                answer++;
                for (int j = i; j <= num; j += i){
                    check[j] = 1;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Main_A2_에라토스테네스_체 T = new Main_A2_에라토스테네스_체();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();

        System.out.println(T.solution(inputInt));
    }
}
