package fun.coding.bronze02.E07_열_개씩_끊어_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_2_substring {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        while (word.length() > 10){
            System.out.println(word.substring(0, 10));
            word = word.substring(10);
        }

        // 만약, words.legnth()가 19라면 10을 처리하고 나머지 9가 남을경우 처리
        System.out.println(word);
    }
}
