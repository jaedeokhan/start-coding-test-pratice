package section01.E12_암호;

import java.io.*;

public class MainA {

    private static final int BINARY_LENGTH = 7;

    public String solution(int n, String signal){

        StringBuilder answer = new StringBuilder();

        signal = signal.replace("#", "1")
                       .replace("*", "0");

        System.out.println(signal);

        for (int i = 0; i < n; i++){
            String binary = signal.substring(0, BINARY_LENGTH);
            int decimal = Integer.parseInt(binary, 2);
            answer.append((char) decimal);
            signal = signal.substring(BINARY_LENGTH);
        }

        return answer.toString();
    }

    public static void main(String[] args) throws IOException {
        MainA T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String signal = br.readLine();
        bw.write(T.solution(n, signal));

        bw.flush();
        bw.close();
    }
}
