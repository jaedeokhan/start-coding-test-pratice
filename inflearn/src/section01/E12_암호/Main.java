package section01.E12_암호;

import java.io.*;

public class Main {

    private static final int BINARY_LENGTH = 7;

    public String solution(int n, String signal){

        StringBuilder answer = new StringBuilder();

        // 1. # -> 1, * -> 0으로 변경
        // 2. n만큼 7개로 분리한다.
        // 3. Integer.parseInt(value, 2)로 이진수 -> 십진수 변환
        // 4. 십진수 -> 아스키 코드로 출력
        signal = signal.replace("#", "1")
                       .replace("*", "0");

        int signalLength = signal.length();

        for (int i = 0; i < signalLength / BINARY_LENGTH; i++){
            int startIndex = i * BINARY_LENGTH;
            int endIndex = BINARY_LENGTH + (BINARY_LENGTH * i);

            String binary = signal.substring(startIndex, endIndex);
            int decimal = Integer.parseInt(binary, 2);
            answer.append((char) decimal);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String signal = br.readLine();
        bw.write(T.solution(n, signal));

        bw.flush();
        bw.close();
    }
}
