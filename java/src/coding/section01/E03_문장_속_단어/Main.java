package coding.section01.E03_문장_속_단어;

import java.util.Scanner;

public class Main {

    // 1. 하나의 문장을 string 변수에 입력 받는다.
    // 2. string 변수를 stringArray에 split 후 배열로 받는다.
    // 3. stringArray의 length()까지 for문을 돌린다.
    // 3-1. stringArray.charAt(i)의 length()가 더 큰 값의 인덱스를 저장한다.
    // 3-2. 가장 긴 값이 여러개일 경우 문장 속에서 가장 앞쪽에 위치한 단어를 답으로 한다.
    // 4. StringArray.charAt(i)를 출력한다.

    public String solution(String string) {

        String answer = "";
        String[] stringArray = string.split(" ");
        final int stringArraySize = stringArray.length;
        int max = -2148000;
        int index = 0;
        int count = 0;

        for (int i = 0; i < stringArraySize; i++) {
            if (stringArray[i].length() > max){
                max = stringArray[i].length();
                index = i;
            }
        }

        for (int i = 0; i < stringArraySize; i++) {
            if (stringArray[i].length() == max){
                count++;
            }
            if (count >= 2){
                System.out.println("index = " + index);
                System.out.println("max = " + max);
                return stringArray[index]; // 가장 긴 단어가 여러 개이면 가장 앞쪽에 위치한 단어 출력
            }
        }

        System.out.println("index = " + index);
        System.out.println("max = " + max);
        return stringArray[index];
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        System.out.println(T.solution(string));
    }
}
