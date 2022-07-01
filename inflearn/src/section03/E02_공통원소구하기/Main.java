package section03.E02_공통원소구하기;

import java.util.*;
import java.io.*;

public class Main {

    public ArrayList<Integer> solution(int n, int[] nArray, int m, int[] mArray){
        ArrayList<Integer> answer = new ArrayList<>();

        // 두 집합의 공통 원소 추출해 오름차순 정렬
        // 1 3 9 5 2 -> 1 2 3 5 9
        // 3 2 5 7 8 -> 2 3 5 7 8
        Arrays.sort(nArray);
        Arrays.sort(mArray);

        int nPointer = 0, mPointer = 0;

        while (nPointer < n && mPointer < m){
            if (nArray[nPointer] == mArray[mPointer]){
                answer.add(nArray[nPointer++]);
                nPointer++;
            } else if (nArray[nPointer] < mArray[mPointer]){
                nPointer++;
            } else if (nArray[nPointer] > mArray[mPointer]){
                mPointer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main T = new Main();

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

        for (int value : T.solution(n, nArray, m, mArray)){
            bw.write(String.valueOf(value) + " ");
        }

        bw.flush();
        bw.close();
    }
}
