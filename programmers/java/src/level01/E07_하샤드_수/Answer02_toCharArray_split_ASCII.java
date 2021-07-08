package level01.E07_하샤드_수;

import org.junit.Test;

public class Answer02_toCharArray_split_ASCII {

    public boolean solution(int x) {

        char[] numbers = Integer.toString(x).toCharArray();
        int sum = 0;

        for (char num : numbers){
            sum += (num - 48); // (아스키 코드) num - 48 // 아스키 코드 48 ~ 57(0 ~ 9)
        }

        return (x % sum == 0)  ? true : false;
    }

    @Test
    public static void main(String[] args) {

        Answer02_toCharArray_split_ASCII T = new Answer02_toCharArray_split_ASCII();
        int[] arr = {10, 12, 11, 13};

        for (int i = 0; i < arr.length; i++){
            System.out.println(T.solution(arr[i]));
        }

    }

}
