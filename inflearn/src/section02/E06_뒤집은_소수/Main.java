package section02.E06_뒤집은_소수;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    private static int[] PRIME_CHECK_ARRAY = new int[100001];

    public int[] solution(int n, int[] primes){

        // 입력 : 첫 줄 자연수 개수(3 <= N <= 100)
        //        다음 줄 N개의 자연수(N >= 100,000)
        // 출력 : 첫 줄에 뒤집은 소수 출력, 출력순서는 입력된 순서대로 출력

        // 조건1
        // - 자연수를 뒤집은 후(910 -> 19로 숫자화)
        //    - 첫 자리부터 연속된 0은 무시한다.

        // 1. for문을 n만큼 반복한다.
        // 1.1. 숫자들을 뒤집어서 다시 배열에 넣는다.
        // 1.2. PRIME_CHECK_ARRAY를 세팅한다.
        // 1.3. 해당 인덱스가 소수인지 배열에 비교해서 소수이면 answer에 append()

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String currentPrime = String.valueOf(primes[i]);
            String reversePrime = new StringBuilder(currentPrime).reverse().toString();
            int reversePrimeNum = Integer.parseInt(reversePrime);
            primes[i] = reversePrimeNum;
        }

        for (int i = 2; i <= 100000; i++){
            if (PRIME_CHECK_ARRAY[i] == 0){
                PRIME_CHECK_ARRAY[i] = 2; // 소수인 값
                for (int j = i + i; j <= 100000; j += i){
                    PRIME_CHECK_ARRAY[j] = 1; // 소수가 아닌 값
                }
            }
        }

        for (int i = 0; i < n; i++){
            int prime = primes[i];
            if (PRIME_CHECK_ARRAY[prime] == 2){
                answer.add(prime);
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

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
