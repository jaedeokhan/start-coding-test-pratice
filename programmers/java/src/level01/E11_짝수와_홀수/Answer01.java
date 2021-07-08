package level01.E11_짝수와_홀수;

import java.util.Arrays;

public class Answer01 {

    public String solution(int num) {

        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Answer01 T = new Answer01();

        int[] nums = {3, 4};

        for (int i = 0; i < nums.length; i++){
            System.out.println((T.solution(nums[i])));
        }

    }

}
