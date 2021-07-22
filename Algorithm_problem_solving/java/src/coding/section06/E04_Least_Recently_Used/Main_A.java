package coding.section06.E04_Least_Recently_Used;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_A {

    public int[] solution(int size, int n, int[] memory) {

        int[] answer = new int[size];
        for (int x : memory){
            int pos = -1;
            for (int i = 0; i < size; i++) if (x == answer[i]) pos = i;
            if (pos == -1){ // miss
                for (int i = size - 1; i >= 1; i--){
                    answer[i] = answer[i - 1];
                }
            } else { // hit
                for (int i = pos; i >= 1; i--){
                    answer[i] = answer[i - 1];
                }
            }
            answer[0] = x;
        }


        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
//        Scanner scan = new Scanner(System.in);
//        int s = scan.nextInt();
//        int n = scan.nextInt();
//        int[] memory = new int[n];
//        for (int i = 0; i < n; i++){
//            memory[i] = scan.nextInt();
//        }
//
//        for (int x : T.solution(s, n, memory)){
//            System.out.print(x + " ");
//        }

        int s = 5;
        int n = 9;
        int[] memory = {1, 2, 3, 2, 6, 2, 3, 5, 7};

        for (int x : T.solution(s, n, memory)){
            System.out.print(x + " ");
        }

    }
}
