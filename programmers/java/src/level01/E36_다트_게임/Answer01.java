package level01.E36_다트_게임;

import java.util.HashMap;
import java.util.Stack;

public class Answer01 {

    // 조건
    // 1. 다트 게임은 총 3번
    // 2. 점수는 0점 ~ 10점
    // 3. Single(S), Double(D), Triple(T) 영역 존재
    // 4. 옵션 : 스타상(*) => 해당 점수 2배 , 아차상(#) => 해당 점수 마이너스
    // 5. 스타상(*)이 첫 번째에 나오면 첫 번째만 2배
    // 6. 스타상(*)은 다른 스타상(*)의 효과와 중첩 => 중첩 스타상은 4배
    // 7. 스타상(*)의 효과는 아차상(#)의 효과와 중첩 => 아차상(#)의 점수 -2배

    // 입력 : 점수|보너스|[옵션]
    // 출력 : int

    // Queue<Integer> numbers set
    // 1. 향상된 for문을 char x : dartResult까지 반복한다.
    // 1-1. if 숫자이면
    // 1-1-1. numbers.add(x)
    // 1-2. else if 알파벳이면
    // 1-2-1. numbers.add(Math.pow(numbers.pop(), 제곱))
    // 1-3. else if *, #이면
    // 1-3-1.

    public int solution(String dartResult) {

        int answer = 0;
        Stack<Integer> numbers = new Stack<>();
        HashMap<Character, Integer> bouns = new HashMap<>(){{
           put('S', 1);
           put('D', 2);
           put('T', 3);
        }};
        dartResult = dartResult.replace("10","-"); // 10을 -로 치환

        for (char x : dartResult.toCharArray()){

            if (Character.isDigit(x)){ // 숫자이면
                numbers.add(x - 48);
            } else if (Character.isAlphabetic(x)) { // S,D,T이면
                numbers.add((int)Math.pow(numbers.pop(), bouns.get(x)));
            } else if (x == '-'){ // - => 10
                numbers.add(10);
            } else if (x == '*'){ // 스타상
                if (numbers.size() == 1){ // 스택에 1개이면, 즉 첫 번째 값만 존재하면
                    numbers.add(numbers.pop() * 2);
                } else { // 1개보다 크면, 즉 2번째까지 진행된 경우
                    int firstValue = numbers.pop() * 2;
                    int secondValue = numbers.pop() * 2;
                    numbers.add(secondValue); // 스택이니 반대로 넣어주기
                    numbers.add(firstValue);
                }
            } else if (x == '#'){ // 아차상
                numbers.add(numbers.pop() * -1);
            }
        }

        for (int x : numbers){
            answer += x;
        }

        return answer;
    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        String[] dartResult = {
                "1S2D*3T", "1D2S#10S", "1D2S0T", "1S*2T*3S", "1D#2S*3S",
                "1T2D3D#", "1D2S3T*", "1S2D3T*", "1S2D*3T*"
        };

        for (int i = 0; i < dartResult.length; i++){
            System.out.println(T.solution(dartResult[i]));
        }
    }

}
