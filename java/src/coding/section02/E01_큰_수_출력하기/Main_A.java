package coding.section02.E01_큰_수_출력하기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {

    public ArrayList<Integer> solution(int num, int[] intArray){

        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(intArray[0]);

        for (int i = 1; i < num; i++){
            if (intArray[i] > intArray[i-1]){
                answer.add(intArray[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputIntArray.length; i++){
            inputIntArray[i] = scan.nextInt();
        }

        for (int x : T.solution(inputInt, inputIntArray)){
            System.out.print(x + " ");
        }


    }
}
