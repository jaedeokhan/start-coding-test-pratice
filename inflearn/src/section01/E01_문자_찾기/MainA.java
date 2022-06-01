package section01.E01_문자_찾기;

import java.io.*;

public class MainA {

    public int solution(String str, char t) {
        int answer = 0;

        char[] charArray = str.toUpperCase().toCharArray();
        t = Character.toUpperCase(t);

        for (char charArrayValue : charArray) {
            if (charArrayValue == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        MainA T = new MainA();
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String inputString = br.readLine();
        char inputChar = br.readLine().charAt(0);

        int answer = T.solution(inputString, inputChar);

        bw.write(String.valueOf(answer));
        bw.flush();
        bw.close();
    }
}
