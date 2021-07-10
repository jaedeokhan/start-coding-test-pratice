package level01.E21_약수의_합;

public class Answer01 {

    // 정수 n의 모든 약수를 더한 값을 리턴

    public int solution(int n) {

        int answer = 0;

        for (int i = 1; i <= n / 2; i++){ // n / 2만큼 돈다
            if (n % i == 0) answer += i;
        }

        return answer + n; // n의 값은 약수
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] n = {12, 5};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
