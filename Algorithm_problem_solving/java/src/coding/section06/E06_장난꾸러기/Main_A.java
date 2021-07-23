package coding.section06.E06_장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main_A {

    public ArrayList<Integer> solution(int n, int[] array) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] originalArray = array.clone();
        Arrays.sort(originalArray);

        for (int i = 0; i < n; i++){
            if (array[i] != originalArray[i]){
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);

//        int n = scan.nextInt();
//        int[] array = new int[n];
//        for (int i = 0; i < n; i++) array[i] = scan.nextInt();
//        for (int x : T.solution(n, array)){
//            System.out.print(x + " ");
//        }

        int[] n = {9, 6};
        int[][] array = {
                {120, 125, 152, 130, 135, 135, 143, 127, 160},
                {120, 130, 150, 150, 130, 150}
        };

        for (int i = 0; i < n.length; i++){
            for (int x : T.solution(n[i], array[i])){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
