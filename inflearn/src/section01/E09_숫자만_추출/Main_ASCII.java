package section01.E09_숫자만_추출;

import java.io.*;

public class Main_ASCII {

    private static final int ASCII_CODE_ZERO = 48;
    private static final int ASCII_CODE_NINE = 57;

    public int solution(String word){

        int answer = 0;

        for (char w : word.toCharArray()){
            // 0 ~ 9
            if (w >= ASCII_CODE_ZERO && w <= ASCII_CODE_NINE){
                answer = answer * 10 + (w - ASCII_CODE_ZERO);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main_ASCII T = new Main_ASCII();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        bw.write(String.valueOf(T.solution(word)));

        bw.flush();
        bw.close();
    }
}
