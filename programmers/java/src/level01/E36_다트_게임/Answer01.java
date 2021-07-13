package level01.E33_다트_게임;

import java.util.Arrays;

public class Answer01 {

    public int solution(String dartResult) {

        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[] dartResult = {
                "1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S", "1T2D3D#", "1D2S3T*"
        };

        for (int i = 0; i < dartResult.length; i++){
            System.out.println(T.solution(dartResult[i]));
        }
    }

}
