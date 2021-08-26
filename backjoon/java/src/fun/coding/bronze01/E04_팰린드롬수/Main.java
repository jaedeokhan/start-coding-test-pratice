package fun.coding.bronze01.E04_팰린드롬수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze01 1259번 - 팰린드롬수
    public boolean checkPalindrome(String value){
        final int valueLength = value.length();

        // value의 길이가 1이면 팰린드롬
        if (valueLength == 1) return true;

        int middle = valueLength / 2;

        for (int i = 0; i < middle; i++){
            if (value.charAt(i) != value.charAt(valueLength - i - 1)){
                return false; // 팰린드롬이 아니면
            }
        }

        // 팰린드롬이면
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main T = new Main();
        String value = "";

        while ( !(value = br.readLine()).equals("0") ){
            if (T.checkPalindrome(value)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }


    }
}
