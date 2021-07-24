package coding.section06.E07_좌표_정렬;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public int[][] solution(int n, int[][] array) {

        Arrays.sort(array, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] == o2[0]){
                    return o1[1] - o2[1];
                } else {
                    return o1[0] - o2[0];
                }
            }
        });


        return array;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++){
            array[i][0] = scan.nextInt();
            array[i][1] = scan.nextInt();
        }

        for (int[] x : T.solution(n, array)){
            System.out.println(x[0] + " " + x[1]);
        }

//        int n = 8;
//        int[] array = {20, 25, 52, 30, 39, 33, 43, 33};
//        System.out.println(T.solution(n, array));

    }
}
