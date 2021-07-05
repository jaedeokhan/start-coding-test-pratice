package coding.section02.E03_가위바위보;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {

    public String solution(int num, int[] a, int[] b){

        String answer = "";

        for (int i = 0; i < num; i++){
            if (a[i] == b[i]) answer += "D";
            else if (a[i] == 1 && b[i] == 3) answer += "A"; // 가위(1) > 보(3)
            else if (a[i] == 2 && b[i] == 1) answer += "A"; // 바위(2) > 가위(1)
            else if (a[i] == 3 && b[i] == 2) answer += "A"; // 보(3) > 바위(2)
            else answer += "B";
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
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
        for (char x : T.solution(inputInt,inputAarray, inputBarray).toCharArray()){
            System.out.println(x);
        }

    }
}
