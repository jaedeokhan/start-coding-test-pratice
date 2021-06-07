package coding.test.bronze3;

public class E03_피보나치_수열 {
    public static void main(String[] args) {
        // f(n) = f(n - 1) + f(n - 2)
        // 중복호출을 하면 x가 커지면 아주 오랜 시간이 걸린다.
        // 해당 방식은 2 ^ n 이다. 2 ^ 10 = 1024
        System.out.println(fibonacci(40));
    }
    public static int fibonacci(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return fibonacci(x - 1) + fibonacci(x - 2);
        }
    }
}
