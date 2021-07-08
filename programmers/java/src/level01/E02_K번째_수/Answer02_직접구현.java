package level01.E02_K번째_수;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class Answer02_직접구현 {

    public int[] solution(int[] array, int[][] commands) {

        int index = 0;
        int[] answer = new int[commands.length];

        while (index < commands.length){
            int count = commands[index][1] - commands[index][0] + 1;

            if (count == 1){
                answer[index] = array[commands[index++][0]-1];
                continue;
            }

            int[] values = new int[count];
            int j = 0;
            for (int i = commands[index][0]-1; i < commands[index][1]; i++){
                values[j++] = array[i];
            }

            sort(values, 0, count-1);

            answer[index] = values[commands[index++][2]-1];

        }
        return answer;
    }

    void sort(int[] a, int left, int right){
        int pl = left;
        int pr = right;
        int x = a[(pl+pr)/2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr){
                int temp = a[pl];
                a[pl] = a[pr];
                a[pr] = temp;
                pl++;
                pr--;
            }
        } while (pl <= pr);

        if (left < pr) sort(a, left, pr);
        if (right > pl) sort(a, pl, right);
    }

    @Test
    public static void main(String[] args) {

        Answer02_직접구현 T = new Answer02_직접구현();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = {5, 6, 3};

        for (int x : T.solution(array, commands)){
            System.out.print(x + " ");
        }
    }

}
