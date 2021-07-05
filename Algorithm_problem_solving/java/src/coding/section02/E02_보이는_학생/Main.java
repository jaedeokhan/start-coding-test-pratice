package coding.section02.E02_보이는_학생;

import java.util.Scanner;

public class Main {

    // 1. 맨앞은 무조건 보인다.
    // 2. 반복문을 1부터 num까지 반복한다. min = inputArray[0] 설정
    // 2-1. if (inputArray[i] > min) 이면 min = inputArray[i], answer++

    public int solution(int num, int[] intArray){

        int answer = 1, largest = intArray[0];

        for (int i = 1; i < num; i++){
            if (intArray[i] > largest){
                largest = intArray[i];
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        System.out.println(T.solution(inputInt, inputIntArray));


    }
}
