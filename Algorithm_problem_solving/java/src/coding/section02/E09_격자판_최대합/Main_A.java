package coding.section02.E09_격자판_최대합;

import java.util.Scanner;

public class Main_A {

    public int solution(int num, int[][] numArray){

        int answer = Integer.MIN_VALUE;
        int leftSum = 0, rightSum = 0;

        for (int i = 0; i < num; i++){
            int rowSum = 0, colSum = 0;

            leftSum += numArray[i][i]; // 왼쪽 대각선의 합
            rightSum += numArray[i][num-i-1]; // 오른쪽 대각선의 합합

            for (int j = 0; j < num; j ++){
                rowSum += numArray[i][j]; // 행의 합
                colSum += numArray[j][i]; // 열의 합
            }
            answer = Math.max(answer, Math.max(rowSum, colSum));
        }

        answer = Math.max(answer, Math.max(leftSum, rightSum));

        return answer;
    }


    public static void main(String[] args) {

        Main_A T = new Main_A();
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
