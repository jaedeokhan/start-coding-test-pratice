package level01.E04_x만큼_간격이_있는_n개의_숫자;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Scanner;

public class Answer01 {

    public long[] solution(int x, int n) {

        long[] answer = new long[n];
        long sum = 0;

        for (int i = 0; i < n; i++){
            sum += x;
            answer[i] = sum;
        }

        return answer;
    }

    @Test
    public static void main(String[] args) {

        Answer01 T = new Answer01();
        Scanner scan = new Scanner(System.in);
        int[] x = {2, 4, -4};
        int[] n = {5, 3, 2};
        long[][] answer = {{2,4,6,8,10}, {4,8,12}, {-4, -8}};

        int i = 0;
        for (long[] a : answer){
            long[] testAnswer = T.solution(x[i], n[i]);
            i++;
            for (int j = 0; j < testAnswer.length; j++){
                Assert.assertEquals(a[j], testAnswer[j]); // true
            }
        }

        for (int k = 0; k < x.length; k++){
            for (long value : T.solution(x[k], n[k])){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

}
