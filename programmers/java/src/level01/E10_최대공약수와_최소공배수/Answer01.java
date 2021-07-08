package level01.E10_최대공약수와_최소공배수;

import java.util.Arrays;

public class Answer01 {

    public int[] solution(int n, int m) {

        int[] answer = new int[2];
        int min = 0;
        int max = 1;

        for (int i = 1; i <= n; i++){
            if (n % i == 0 && m % i == 0){
                max = i;
            }
        }

        for (int i = n * m; i > 0; i--){
            if (i % n == 0 && i % m == 0)
            min = i;
        }

        answer[0] = max;
        answer[1] = min;

        return answer;

    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] n = {3, 2, 12, 16};
        int[] m = {12, 5, 16, 20};

        for (int i = 0; i < n.length; i++){
            System.out.println(Arrays.toString(T.solution(n[i], m[i])));
        }

    }

}
