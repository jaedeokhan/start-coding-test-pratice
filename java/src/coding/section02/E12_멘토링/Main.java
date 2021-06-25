package coding.section02.E12_멘토링;

import java.util.Scanner;

public class Main {

    // 1.

    public int solution(int classMember, int examCount, int[][] inputArray) {

        int answer = 0;

        for (int i = 1; i <= classMember; i++){
            for (int j = 1; j <= classMember; j++){
                int count = 0;
                for (int k = 0; k < examCount; k++){
                    int posI  = 0, posJ = 0;
                    for (int s = 0; s < classMember; s++){
                        if (inputArray[k][s] == i) posI = s;
                        if (inputArray[k][s] == j) posJ = s;
                    }
                    if (posI < posJ) count++;
                }
                if (count == examCount) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int classMembers = scan.nextInt();
        int examCount = scan.nextInt();
        int[][] inputIntArray = new int[examCount][classMembers];
        for (int i = 0; i < examCount; i++) {
            for (int j = 0; j < classMembers; j++) {
                inputIntArray[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(classMembers, examCount,inputIntArray));
    }
}
