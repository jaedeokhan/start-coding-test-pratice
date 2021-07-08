package level01.E06_핸드폰_번호_가리기;

import org.junit.Test;

import java.util.Scanner;

public class Answer02_toCharArray_valueOf {

    public String solution(String phoneNumber) {

        char[] numbers = phoneNumber.toCharArray();
        for (int i = 0; i < numbers.length - 4; i++){
            numbers[i] = '*';
        }

        return String.valueOf(numbers);
    }

    @Test
    public static void main(String[] args) {

        Answer02_toCharArray_valueOf T = new Answer02_toCharArray_valueOf();
        String[] phoneNumber = {"01033334444", "027778888"};
        String[] answer = {"*******4444", "*****8888"};

        for (int i = 0; i < phoneNumber.length; i++){
            System.out.println(T.solution(phoneNumber[i]));
        }

    }

}
