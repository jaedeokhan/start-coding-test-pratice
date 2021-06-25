package coding.section02.E11_임시반장_정하기;

import java.util.Scanner;

public class Main_A {

    public int solution(int num, int[][] inputArray) {

        int answer = 0, max = Integer.MIN_VALUE;

        for (int i = 1; i <= num; i++){ // num 학생까지
            int count = 0; // i와  j번 학생이 같은반을 몇 번 했는가?
            for (int j = 1; j <= num; j++){
                for (int k = 1; k <= 5; k++){
                    if (inputArray[i][k] == inputArray[j][k]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max){
                max = count;
                answer = i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[][] inputIntArray = new int[inputInt+1][6];
        for (int i = 1; i <= inputInt; i++) {
            for (int j = 1; j <= 5; j++) {
                inputIntArray[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(inputInt, inputIntArray));
    }
}
