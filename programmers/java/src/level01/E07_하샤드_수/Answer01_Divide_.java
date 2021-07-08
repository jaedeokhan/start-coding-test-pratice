package level01.E07_하샤드_수;

import org.junit.Test;

public class Answer01_Divide_ {

    // 1. while문으로 자릿수의 합 sum을 구하기
    // 2. x를 sum으로 나눠서 나머지가 0이면 하샤드 수

    public boolean solution(int x) {

        boolean answer = true;
        int originalX = x;
        int sum = 0;

        while (x > 0){
            sum = sum + (x % 10);
            x = x / 10;
        }

        return (originalX % sum == 0)  ? true : false;
    }

    @Test
    public static void main(String[] args) {

        Answer01_Divide_ T = new Answer01_Divide_();
        int[] arr = {10, 12, 11, 13};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
