package fun.coding.bronze02.E13_알파벳_개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze02 10808번 - 알파벳 개수[https://www.acmicpc.net/problem/10808]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine();
        int[] wordCount = new int[26];

        for (int i = 0; i < word.length(); i++){
            wordCount[word.charAt(i) - 'a'] += 1;
        }

        for (int x : wordCount){
            System.out.print(x + " ");
        }
    }
}
