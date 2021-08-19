package fun.coding.bronze01.E02_그대로_출력하기_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // bronze1 11719번 - 그대로 출력하기 2
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String string = "";
        while((string = br.readLine()) != null){
            System.out.println(string);
        }

    }
}
