package fun.coding.sliver05.E03_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_2_수학연산_카운팅정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[10];
        int N = Integer.parseInt(br.readLine());

        while (N != 0){
            counting[N % 10]++;
            N /= 10;
        }

        for (int i = 9; i >= 0; i--){
            while (counting[i]-- > 0){
                System.out.print(i);
            }
        }

    }
}
