package level01.E23_수박수박수박수박수박수;

public class Answer02_replaces_substring {

    // (n = 3, answer = "수박수") , (n = 4, answer = "수박수박")

    public String solution(int n) {

        // new char[n / 2 + 1] 으로 char 배열에 [n / 2 + 1] 공간만큼 만들어 준다.
        // new String()으로 위의 char[]을 감싸고 공백을 "수박"으로 replace해준다.
        // substring(0, n)까지 끊어낸다.

        return new String(new char[n / 2 + 1]).replace("\0", "수박").substring(0, n);
    }

    public static void main(String[] args) {

        Answer02_replaces_substring T = new Answer02_replaces_substring();
        int[] n = {3, 4};

        for (int i = 0; i < n.length; i++){
            System.out.println(T.solution(n[i]));
        }
    }

}
