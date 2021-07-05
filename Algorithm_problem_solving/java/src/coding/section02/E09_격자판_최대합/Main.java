package coding.section02.E09_격자판_최대합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. 최댓값을 저장할 largest를 set
    // 2. for문을 0부터 n까지 반복한다.
    // 2-1. colSum, rowSum = 0 set
    // 2-2. for문을 0부터 n까지 반복한다.
    // 2-2-1. if numArray[i][j] 각각의 행의 값은 rowSum += numArray[i][j]
    // 2-2-2. else numArray[j][i] 각각의 열의 값은 colSum += numArray[j][i]
    // 2-3. max = Math.max(max, rowSum)
    // 2-4. max = Math.max(max, colSum)

    public int solution(int num, int[][] numArray){

        int largest = Integer.MIN_VALUE;

        // 행, 열
        for (int i = 0; i < num; i++){
            int colSum = 0, rowSum = 0;
            for (int j = 0; j < num; j++){
                rowSum += numArray[i][j];
                colSum += numArray[j][i];
            }
            largest = Math.max(largest, rowSum);
            largest = Math.max(largest, colSum);
        }

        // 왼쪽 대각선, 오른쪽 대각선
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < num; i++){
            leftSum += numArray[i][i];
            rightSum += numArray[i][num-i-1];
        }

        largest = Math.max(largest, leftSum);
        largest = Math.max(largest, rightSum);

        return largest;
    }


    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[][] inputIntArray = new int[inputInt][inputInt];
        for (int i = 0; i < inputInt; i++){
            for (int j = 0; j < inputInt; j++){
               inputIntArray[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(inputInt, inputIntArray));
    }
}
