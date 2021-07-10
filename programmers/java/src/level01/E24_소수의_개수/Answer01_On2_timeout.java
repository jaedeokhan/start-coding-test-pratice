package level01.E24_소수의_개수;

public class Answer01_On2_timeout {

    // n사이에 있는 소수의 개수를 반환하는 함수
    // 소수는 1과 자기 자신으로만 나누어지는 수!

    public int solution(int n) {

        int answer = 0;

        // n이 1,000,000 백만이기에 O(n ^ 2) 방식으로 푸니 에러가 난다.

        for (int i = 2; i <= n; i++){
            boolean isPrime = true;
            for (int j = 1; j <= i; j++){
                if (j == 1 || i == j) continue;
                if (i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01_On2_timeout T = new Answer01_On2_timeout();
        int[] n = {10, 5};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
