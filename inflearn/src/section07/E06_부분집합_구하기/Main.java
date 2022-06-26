package section07.E06_부분집합_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    static int[] check;

    public void printCheckArray(){
        for (int i = 1; i < check.length; i++){
            if (check[i] == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public void DFS(int l){

        // 입력 : l(1 <= l <= 10)
        // 출력 : 부분집합
        // 조건, 공집합은 출력하지 않는다.

        // 종료조건
        if (l == n + 1){
            printCheckArray();
            return;
        }

        // 왼쪽 가지
        check[l] = 1;
        DFS(l + 1);

        // 오른쪽 가지
        check[l] = 0;
        DFS(l + 1);
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        check = new int[n + 1];

        T.DFS(1);
    }
}
