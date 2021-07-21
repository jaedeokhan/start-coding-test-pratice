package level01.E40_약수의_개수와_덧셈;

import java.util.Set;
import java.util.TreeSet;

public class Answer01 {

    // 약수의 개수가 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 리턴

    public int solution(int left, int right) {

        int answer = 0;

        for (int i = left; i <= right; i++){
            int divisorCount = 1; // 마지막 수는 for문을 돌지 않고 약수이니 포함
            for (int j = 1; j <= i / 2; j++){
                if (i % j == 0) divisorCount += 1;
            }
            answer += (divisorCount % 2 == 0) ? i : -i;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] left = {13, 24, 1, 1};
        int[] right = {17, 27, 2, 1};


        for (int i = 0; i < left.length; i++){
            System.out.println(T.solution(left[i], right[i]));
        }

    }

}
