package coding.section03.E05_연속된_자연수의_합;

import java.util.Scanner;

public class Main_A2_나머지_몫_해결방식 {

    // 몫과 나머지를 이용해서 구현

    public int solution(int n) {

        int answer = 0, count = 1;
        n--;
        while (n > 0){
            count++;
            n = n - count;
            if (n % count == 0){ // 연속된 자연수가 가능하면
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A2_나머지_몫_해결방식 T = new Main_A2_나머지_몫_해결방식();
        Scanner scan = new Scanner(System.in);
        int n  = scan.nextInt();

        System.out.print(T.solution(n));

    }
}
