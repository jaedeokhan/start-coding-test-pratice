package coding.section06.E01_선택_정렬;

import java.util.Scanner;

public class Main_A {

    // int[] arr에 맨 앞에 작은 수를 놔두면서
    // i는 0부터 N - 1까지
    // j는 i + 1로 N까지

    public int[] solution(int n, int[] array) {

        for (int i = 0; i < n - 1; i++){
            int index = i;
            for (int j = i + 1; j < n; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        return array;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scan.nextInt();
        for (int x : T.solution(n, array)) System.out.print(x + " ");

//        int n = 6;
//        int[] array = {13, 5, 11, 7, 23, 15};
//        for (int x : T.solution(n, array)){
//            System.out.print(x + " ");
//        }

    }
}
