package coding.section02.E06_뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_A {

    public boolean isPrime(int num){

        if (num == 1) return false;

        for (int i = 2; i < num; i++){
            if (num % i == 0) return false; // 1, 자기 자신이 아닌 다른 약수가 있으면!
        }

        return true;
    }

    public ArrayList<Integer> solution(int num, int[] numArray){

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num; i++){
            int result = 0;
            int value = numArray[i];
            while (value > 0) {
                int remainder = value % 10;
                result = result * 10 + remainder;
                value = value / 10;
            }

            if (isPrime(result)) answer.add(result);

        }

        return answer;
    }


    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();
        int[] inputIntArray = new int[inputInt];
        for (int i = 0; i < inputInt; i++){
            inputIntArray[i] = scan.nextInt();
        }

        for (int x : T.solution(inputInt, inputIntArray)) {
            System.out.print(x + " ");
        }
    }
}
