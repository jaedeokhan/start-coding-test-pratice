package coding.section02.E10_봉우리;

import java.util.Scanner;

public class Main_A2 {

    public int solution(int num, int[][] inputArray){

        int answer = 0;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int i = 0; i < num; i++){
            for (int j = 0; j < num; j++){
                boolean flag = true;
                for (int k = 0; k < 4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < num && ny >= 0 && ny < num &&
                            inputArray[nx][ny] >= inputArray[i][j]){
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main_A2 T = new Main_A2();
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
