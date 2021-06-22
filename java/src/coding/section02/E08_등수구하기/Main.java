package coding.section02.E08_등수구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    // 1. numArray.sort() 해서 오름차순 정렬을 해준다.
    // 2. for문을 0부터 num까지 반복한다. => i
    // 2-1. for문을 0부터 num까지 반복한다. => j
    // 2-2. if i < j 작다면 answer += 1

    public int[] solution(int num, int[] numArray){

        int[] answer = new int[num];
        ArrayList<Integer> array = new ArrayList<>();

        for (int x : numArray){
            array.add(x);
        }

        Arrays.sort(numArray);

        for (int i = 0; i < num; i++){
            int rank = 1;
            for (int j = 0; j < num; j++){
                if (array.get(i) < numArray[j]){
                    rank++;
                }
            }
            answer[i] = rank;
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

        for (int x : T.solution(inputInt, inputIntArray)){
            System.out.print(x + " ");
        }

    }
}
