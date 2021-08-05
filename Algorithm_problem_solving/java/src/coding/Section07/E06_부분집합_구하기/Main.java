package coding.Section07.E06_부분집합_구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int n;
    static int[] checked;

    public void print(){
        StringBuilder temp = new StringBuilder();
        for (int i = 1; i < checked.length; i++){
            if (checked[i] == 1){
                temp.append(i + " ");
            }
        }
        if (temp.length() > 0){
            System.out.println(temp);
        }
    }

    public void DFS(int L) {

        if (L == n + 1) {
            print();
        }
        else {
            checked[L] = 1;
            DFS(L + 1);
            checked[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = 3;
        checked = new int[n + 1];
        T.DFS(1);
    }
}
