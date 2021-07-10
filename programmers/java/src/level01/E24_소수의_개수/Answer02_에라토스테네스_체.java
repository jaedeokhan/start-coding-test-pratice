package level01.E24_소수의_개수;

public class Answer02_에라토스테네스_체 {

    public int solution(int n) {

        // 에라토스트네네스 체로 2,3,4,5 ~ 각각의 배수를 처리하여 해결
        int answer = 0;
        int[] sieve = new int[n+1];

        for (int i = 2; i <= n; i++){
            if (sieve[i] == 0) {
                answer++;
                for (int j = i; j <= n; j += i){
                    sieve[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer02_에라토스테네스_체 T = new Answer02_에라토스테네스_체();
        int[] n = {10, 5};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
