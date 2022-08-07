package fun.coding.sliver05.E05_거스름돈_14916;

import javax.print.attribute.IntegerSyntax;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력 : 거스름돈 액수(1 <= n <= 100,000)
        // 출력 : 거스름돈 동전의 최소 개수 출력, 없다면 -1
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> dp = new ArrayList<>(Arrays.asList(-1, -1, 1, -1, 2, 1, 3, 2, 4, 3));

        for (int i = 10; i <= n; i++){
            dp.add(dp.get(i - 5) + 1);
        }

        bw.write(String.valueOf(dp.get(n)));
        bw.flush();
        bw.close();
    }
}
