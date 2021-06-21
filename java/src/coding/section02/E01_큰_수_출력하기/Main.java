package coding.section02.E01_큰_수_출력하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. int[] array = new int[num] 크기만큼 만들어 준다.
    // 2. for문을 num-1만큼 반복한다.
    // 2-1. if (i == 0) 이면 array[i]에 intArray[i]값을 넣어주낟.
    // 2-2. if (intArray[i] > intArray[i-1]) 이면
    // array[i] 에 intArray[i]를 넣는다.

    public String solution(int num, int[] intArray){

        String answer = "";

        for (int i = 0; i < num; i++){
            if (i == 0){
                answer += intArray[i] + " ";
                continue;
            }
            if (intArray[i] > intArray[i-1]){
                answer += intArray[i] + " ";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputIntArray.length; i++){
            inputIntArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(inputInt, inputIntArray));


    }
}
