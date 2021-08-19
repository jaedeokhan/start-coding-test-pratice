package fun.coding.sliver05.E03_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_4_charAt_카운팅 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] counting = new int[10];
        String string = br.readLine();

        for (int i = 0; i < string.length(); i++){
            counting[string.charAt(i) - '0']++;
        }

        for (int i = 9; i >= 0; i--){
            while (counting[i]-- > 0){
                System.out.print(i);
            }
        }
    }
}
