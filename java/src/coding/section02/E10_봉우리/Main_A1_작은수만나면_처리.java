package coding.section02.E10_봉우리;

import java.util.Scanner;

public class Main_A1_작은수만나면_처리 {

    // 현재숫자에서 오른쪽, 아래, 왼쪽, 위에서 작은 수를 만나면 처리하는 방식
    // 현재숫자보다 작은수들은 봉우리가 아니기에 answer의 초기값은 배열 row * col로 하고 answer-- 가감하는 방식 진행
    // (현재숫자) <=  (각 방향) 이하인 수를 만나면 answer-- 처리 후 break

    public int solution(int num, int[][] inputArray){

        int answer = num * num;
        int[][] newArray = new int[num+2][num+2];
        int[] row = {1, 0, -1, 0};
        int[] col = {0, 1, 0, -1};

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                newArray[i][j] = inputArray[i-1][j-1];
            }
        }

        for (int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++){
                 int count = 0;
                 for (int k = 0; k < row.length; k++){
                    if (newArray[i][j] <= newArray[i + col[k]][j + row[k]]) {
                       answer--;
                       break;
                    }
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {

        Main_A1_작은수만나면_처리 T = new Main_A1_작은수만나면_처리();
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
