package coding.section02.E10_봉우리;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 현재 인덱스의 값이 오른쪽, 아래, 왼쪽, 위쪽보다 큰지 count++ 를 세고, 4개이면 answer++해준다.
    // 자신의 상하좌우 보다 큰 숫자는 봉우리 지역! => 봉우리 지역의 총 갯수를 찾기
    // 1. num의 크기 +2 배열을 numArray의 앞 행에 추가, 뒷 행에 추가하기, numArray의 [0], [num-1]에 0을 추가

    public int solution(int num, int[][] inputArray) {

        int answer = 0;
        int[][] newArray = new int[num + 2][num + 2];
        int[] row = {1, 0, -1, 0};
        int[] col = {0, 1, 0, -1};

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                newArray[i][j] = inputArray[i - 1][j - 1];
            }
        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                int count = 0;
                for (int k = 0; k < row.length; k++) {
                    if (newArray[i][j] > newArray[i + col[k]][j + row[k]]) {
                        count++;
                    }
                }
                if (count == 4) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[][] inputIntArray = new int[inputInt][inputInt];
        for (int i = 0; i < inputInt; i++) {
            for (int j = 0; j < inputInt; j++) {
                inputIntArray[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(inputInt, inputIntArray));
    }
}
