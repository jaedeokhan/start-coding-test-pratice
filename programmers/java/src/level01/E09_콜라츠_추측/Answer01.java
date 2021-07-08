package level01.E09_콜라츠_추측;

public class Answer01 {

    // 주어진 수가 1이 될때까지 콜라츠 추측을 이용하기 - 작업을 500번해도 안되면 -1 반환
    // 1-1. 입력된 수가 짝수면 2로 나눈다.
    // 1-2. 입력된 수가 홀수면 3을 곱하고 1을 더한다.
    // 2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복한다.

    public int solution(long num) {

        for (int i = 0; i < 500; i++){
            if (num == 1) return i;
            num = (num % 2 == 0) ? num / 2: num * 3 + 1;
        }

        return -1;

    }

    public static void main(String[] args) {

        Answer01 T = new Answer01();
        int[] n = {6, 16, 626331};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
