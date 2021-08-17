package fun.coding.bronze02.E04_단어의_개수_1152;


import java.io.IOException;

public class Main_4_원시_카운트 {
    // bronze2 1152번, 단어의 개수[https://www.acmicpc.net/problem/1152]
    // 문제 - 영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다.
    // 이 문자열에는 몇 개의 단어가 있을까?
    // 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
    // 주의 - 문자열의 앞과 뒤에는 공백이 있을 수도 있다.

    public static void main(String[] args) throws IOException {
        int count = 0;
        int preString = 32; // 공백을 의미
        int string;

        while (true) {
            string = System.in.read();

            // 입력받은 문자가 공백일 때,
            if (string == 32){
                // 이전의 문자가 공백이 아니면
                if (preString != 32) count++;
            } else if (string == 10) { // 이전의 문자가 개행일때 ('\n')
                // 이전의 문자가 공백이 아니면
                if (preString != 32) count++;
                break;
            }

            preString = string;
        }

        System.out.println(count);
    }
}
