package coding.section02.E05_소수_에라토스테네스_체;

import java.util.Scanner;

public class Main_A1_에라토스테네스_체 {

    // 1. n개의 수인 num의 갯수 + 1만큼의 0으로 채워진 배열을 만든다.
    // 2. for문을 2부터 num + 1까지 돈다.
    // 2-1. if array[num] == 0 이면 array[num] = 1; cnt++;
    // 2-1-1. for문을 j = 2; j를 num + 1까지 j*=i 로 돈다.
    // 2-1-1-1. array[j] = 1;

    public int solution(int num){

        int[] primeArray = new int[num+1];
        int primeCount = 0;

        for (int i = 0; i < num + 1; i++){
            primeArray[i] = 0;
        }

        for (int i = 2; i < num + 1; i++){
            if (primeArray[i] == 0){
                primeCount++;
                for (int j = i; j < num + 1; j += i){

                    if (primeArray[j] == 0) primeArray[j] = 1;
                }
            }
        }

        return primeCount;
    }


    public static void main(String[] args) {

        Main_A1_에라토스테네스_체 T = new Main_A1_에라토스테네스_체();
        Scanner scan = new Scanner(System.in);
        int inputInt = scan.nextInt();

        System.out.println(T.solution(inputInt));
    }
}
