package section03.E01_두_배열_합치기;

import java.util.*;
import java.io.*;

public class Main {

    public ArrayList<Integer> solution(int n, int[] nArray, int m, int[] mArray){

        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++){
            answer.add(nArray[i]);
        }

        for (int j = 0; j < m; j++){
            answer.add(mArray[j]);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] nArray = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            nArray[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] mArray = new int[m];
        st = new StringTokenizer(br.readLine());

        for (int j = 0; j < m; j++){
            mArray[j] = Integer.parseInt(st.nextToken());
        }

        Main T = new Main();

        for (int value : T.solution(n, nArray, m, mArray)){
            bw.write(String.valueOf(value) + " ");
        }

        bw.flush();
        bw.close();

    }
}