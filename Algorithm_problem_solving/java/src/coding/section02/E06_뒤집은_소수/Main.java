package coding.section02.E06_뒤집은_소수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    // 1. 각 자연수를 뒤집는 reverseInt() 메서드 만들기
    // 2. 소수인지 판단하는 checkPrime() 메서드 만들기

    public int reverseInt(int x) {

        int value = 0;

        while (x > 0){
            value =  (value * 10) + (x % 10);
            x = x / 10;
        }
        
        return value;
    }

    public int checkPrime(int x){

        int[] check = new int[x+1];

        if (x == 1){  // 1은 소수가 아니다.
            return 1; // 소수가 아니기에 1은 return
        }

        for (int i = 2; i <= x; i++){
            if (check[i] == 0){
                check[i] = 0; // 첫 번째 0이면 소수
                for (int j = i+i; j <= x; j += i){
                    check[j] = 1; // 소수가 아닌 수들은 1을 저장
                }
            }
        }

        return check[x];
    }

    public ArrayList<Integer> solution(int num, int[] numArray){

        ArrayList<Integer> answer = new ArrayList<>();
        int[] revserIntArray = new int[num];

        for (int i = 0; i < num; i++){
            int reverseValue = reverseInt(numArray[i]);
            if (checkPrime(reverseValue) == 0){ // 소수이면
                answer.add(reverseValue);
            }
        }

        return answer;
    }


    public static void main(String[] args) {

        Main T = new Main();
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
