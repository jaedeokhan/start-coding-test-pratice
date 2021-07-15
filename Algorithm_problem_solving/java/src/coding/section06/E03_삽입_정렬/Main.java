package coding.section06.E03_삽입_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] array) {

        for (int i = 1; i < n; i++){
            int nowValue = array[i], j;
            for (j = i - 1; j >= 0; j--){
                if (array[j] > nowValue) array[j + 1] = array[j];
                else break;
            }
            array[j + 1] = nowValue;
        }

        return array;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);

//        int n = scan.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) array[i] = scan.nextInt();
//        for (int x : T.solution(n, array)) System.out.print(x + " ");

        int n = 6;
        int[] array = {11, 7, 5, 6, 10, 9};
        System.out.println(Arrays.toString(T.solution(n, array)));

    }
}
