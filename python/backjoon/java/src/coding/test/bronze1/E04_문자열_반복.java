package coding.test.bronze1;

import java.util.Scanner;

public class E04_문자열_반복 {
    public static void main(String[] args) {

        // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만들어서 출력
        // 1. 첫째 줄에 테스트 케이스 수인 t를 입력 받고, 각 테스트 케이스 반복횟수 r와 문자열 s가 입력
        // 2. t의 갯수만큼 for문을 돌린다.
        //  2-1. r의 갯수만큼 for문을 돌린다.
        //      2-1-1. 문자열 s의 인덱스에 접근해서 answer 문자열에 더해준다.
        // 3. t for문이 끝나면 List<answer>에 추가해준다.

        Scanner sc = new Scanner(System.in);
/*        int test_case = sc.nextInt();
        String[] answer_array = new String[test_case];

        for (int i = 0; i < test_case; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            String answer = "";

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    answer += s.charAt(j);
                }
            }
            answer_array[i] = answer;
        }

        for (String s : answer_array) {
            System.out.println(s);
        }*/

        int test_case = sc.nextInt();

        for (int i = 0; i < test_case; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
            System.out.println();
        }
    }
}

