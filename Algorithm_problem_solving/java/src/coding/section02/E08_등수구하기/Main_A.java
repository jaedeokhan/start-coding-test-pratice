package coding.section02.E08_등수구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

    public int[] solution(int num, int[] numArray){

        int[] answer = new int[num];

        for (int i = 0; i < num; i++){
            int rank = 1;
            for (int j = 0; j < num; j++){
                if (numArray[j] > numArray[i]){
                    rank++;
                }
            }
            answer[i] = rank;
        }

        return answer;
    }


    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        for (int x : T.solution(inputInt, inputIntArray)){
            System.out.print(x + " ");
        }

    }
}
