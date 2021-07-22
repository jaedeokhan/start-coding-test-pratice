package coding.section06.E03_삽입_정렬;

import java.util.Arrays;
import java.util.Scanner;

public class Main_2 {

    // 시간 복잡도 O(n ^ 2)
    // 각 숫자를 적절한 위치에 삽입하면 어떨까?
    // 앞이 정렬되었다고 가정을 한다
    // 즉, "필요할 때만" 위치를 바꾼다
    // 그렇기에 버블정렬과 선택정렬보다 더 빠르다

    public int[] solution(int n, int[] array) {

        int j, temp;

        for (int i = 0; i < n - 1; i++){
            j = i;
            while (j >= 0 && array[j] > array[j + 1]){
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp
                ;
                j--;
            }
        }

        return array;
    }

    public static void main(String[] args) {

        Main_2 T = new Main_2();
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
