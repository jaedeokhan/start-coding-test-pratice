package fun.coding.sliver05.E03_소트인사이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_3_toCharArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArray = br.readLine().toCharArray();

        Arrays.sort(charArray);

        for (int i = charArray.length - 1; i >= 0; i--){
            System.out.print(charArray[i]);
        }
    }
}
