package coding.section02.E03_가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Character> solution(int num, int[] a, int[] b){

        ArrayList<Character> answer = new ArrayList<>();

        for (int i = 0; i < num; i++){
            if ( (a[i] == 2 && b[i] == 1) || (a[i] == 1 && b[i] == 3) ||
                    (a[i] == 3 && b[i] == 2)){ // A승
                answer.add('A');
            } else if ( (a[i] == 1 && b[i] == 1) || (a[i] == 2 && b[i] == 2) ||
                    (a[i] == 3 && b[i] == 3)){ // 무승부
                answer.add('D');
            } else { // B 승
                answer.add('B');
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputAarray = new int[inputInt];
        int[] inputBarray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputAarray[i] = scan.nextInt();
        }
        for (int i = 0; i < inputInt; i++){
            inputBarray[i] = scan.nextInt();
        }

        for (char c : T.solution(inputInt,inputAarray, inputBarray)){
            System.out.println(c);
        }

    }
}
