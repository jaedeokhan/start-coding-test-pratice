package level01.E13_정수_제곱근_판별;

public class Answer01_Math_pow_sqrt {

    public long solution(long num) {

        if (Math.pow((int) Math.sqrt(num), 2) == num){
            return (long) Math.pow(Math.sqrt(num) + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {

        Answer01_Math_pow_sqrt T = new Answer01_Math_pow_sqrt();
        long[] n = {121, 3};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }

    }

}
