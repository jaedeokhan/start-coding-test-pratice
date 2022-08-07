package fun.coding.bronze01.E05_쉽게_푸는_문제_1292;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> allNumber = new ArrayList<>();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                allNumber.add(i);

            }
        }

        int answer = 0;

        for (int i = a - 1; i <= b - 1; i++){
            answer += allNumber.get(i);
        }

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
