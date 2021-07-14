package coding.section06.E02_버블_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

    public int[] solution(int n, int[] array) {

        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - i - 1; j++){
                if (array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        return array;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++){
//            array[i] = scan.nextInt();
//        }
//        System.out.println(Arrays.toString(T.solution(n, array)));

        int n = 6;
        int[] array = {13, 5, 11, 7, 23, 15};
        System.out.println(Arrays.toString(T.solution(n, array)));

    }
}
