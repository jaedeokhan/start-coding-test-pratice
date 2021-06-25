package coding.section02.E11_임시반장_정하기;

import java.util.Arrays;
import java.util.Scanner;

public class Main_F {

    // 1. 같은 반이였던 수를 셀 num크기 만큼의 count 배열을 만들어 준다.
    // 2. for 문을 i 부터 반의 갯수인 5까지 돌려준다.
    // 2-1. for 문을 j 부터 num-1까지 돌려준다.
    // 2-1-1. for 문을 k = j + 1; k < num까지 돌려준다.
    // 2-1-1-1. if array[j][i] == n[k][i] 이면 count[j]++, count[k]++ 해준다.

    public int solution(int num, int[][] inputArray) {

        int answer = 0;
        int[] count = new int[num];
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < 5; i++) {

            boolean[] check = new boolean[num];
            for (int j = 0; j < check.length; j++){
                check[j] = true;
            }

            for (int j = 0; j < num - 1; j++) {
                for (int k = j + 1; k < num; k++) {
                    if (inputArray[j][i] == inputArray[k][i]) {
                        if (check[j]){
                            count[j]++;
                            check[j] = false;
                        }
                        if (check[k]){
                            count[k]++;
                            check[k] = false;
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.toString(count));

        for (int i = 0; i < count.length; i++){
            largest = Math.max(largest, count[i]);
        }

        for (int i = 0; i < count.length; i++){
            if (largest == count[i]){
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_F T = new Main_F();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[][] inputIntArray = new int[inputInt][5];
        for (int i = 0; i < inputInt; i++) {
            for (int j = 0; j < 5; j++) {
                inputIntArray[i][j] = scan.nextInt();
            }
        }

        System.out.println(T.solution(inputInt, inputIntArray));
    }
}
