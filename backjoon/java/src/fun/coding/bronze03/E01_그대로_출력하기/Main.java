package fun.coding.bronze03.E01_그대로_출력하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze3, 11718번 - 그대로 출력하기[https://www.acmicpc.net/problem/11718]
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = "";

        while ((string = br.readLine()) != null){
            System.out.println(string);
        }

    }
}
