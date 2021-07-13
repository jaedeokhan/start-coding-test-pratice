package coding.section06.E01_선택_정렬;

import java.util.*;

public class Main {

    public int[] solution(int n, int[] array) {

        int index = 0;

        for (int i = 0; i < n - 1; i++){
            int min = Integer.MAX_VALUE;
            for (int j = i; j < n; j++){
                if (min > array[j]){
                    min = array[j];
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

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++){
//            array[i] = scan.nextInt();
//        }
//        System.out.println(Arrays.toString(T.solution(n, array)));

        int n = 6;
        int[] array = {13, 5, 11, 7, 23, 15};
        for (int x : T.solution(n, array)){
            System.out.print(x + " ");
        }

    }
}
