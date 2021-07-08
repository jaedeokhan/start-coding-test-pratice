package level01.E06_핸드폰_번호_가리기;

import org.junit.Test;

import java.util.Scanner;

public class Answer01_StringBuilder {

    public String solution(String phoneNumber) {

        StringBuilder answer = new StringBuilder();
        int starLength = phoneNumber.length() - 4;

        for (int i = 0; i < starLength; i++){
            answer.append("*");
        }

        answer.append(phoneNumber.substring(starLength));

        return answer.toString();
    }

    @Test
    public static void main(String[] args) {

        Answer01_StringBuilder T = new Answer01_StringBuilder();
        String[] phoneNumber = {"01033334444", "027778888"};
        String[] answer = {"*******4444", "*****8888"};

        for (int i = 0; i < phoneNumber.length; i++){
            System.out.println(T.solution(phoneNumber[i]));
        }

    }

}
