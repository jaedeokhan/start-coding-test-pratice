package section01.E01_문자_찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader((System.in)));

        String inputString = bf.readLine();
        char inputChar = bf.readLine().charAt(0);

        // 소문자로 변환
        int matchedCount = 0;
        String lowerString = inputString.toLowerCase();
        char lowerChar = Character.toLowerCase(inputChar);

        for (int i = 0; i < lowerString.length(); i++) {
            if (lowerString.charAt(i) == lowerChar){
                matchedCount++;
            }
        }

        System.out.println(matchedCount);
    }
}
