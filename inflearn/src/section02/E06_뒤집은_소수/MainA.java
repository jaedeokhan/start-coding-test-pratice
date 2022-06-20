package section02.E06_뒤집은_소수;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainA {

    private static int[] PRIME_CHECK_ARRAY = new int[100001];

    public boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public int[] solution(int n, int[] primes){

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int currentPrime = primes[i];
            int reversePrime = 0;

            while (currentPrime > 0){
                int remainder = currentPrime % 10;
                currentPrime = currentPrime / 10;
                reversePrime = (reversePrime * 10) + remainder;
            }

            if (isPrime(reversePrime)){
                answer.add(reversePrime);
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) throws IOException {

        MainA T = new MainA();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] primes = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            primes[i] = Integer.parseInt(st.nextToken());
        }

        for (int prime : T.solution(n, primes)){
            bw.write(String.valueOf(prime + " "));
        }

        bw.flush();
        bw.close();
    }
}
