package section03.E01_두_배열_합치기;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainA {

    public ArrayList<Integer> solution(int n, int[] nArray, int m, int[] mArray){

        ArrayList<Integer> answer = new ArrayList<>();
        int nPointer = 0, mPointer = 0;

        // 1. nArray[nPointer] < mArray[mPointer]
        //    - answer.add(nArray[nPointer]);
        //    - nPointer++;
        // 2. else
        //    - answer.add(mArray[nPointer]);
        //

         while (nPointer < n && mPointer < m){

             if (nArray[nPointer] < mArray[mPointer]){
                 answer.add(nArray[nPointer++]);
             } else {
                 answer.add(mArray[mPointer++]);
             }
         }

         while (nPointer < n){
             answer.add(nArray[nPointer++]);
         }

         while (mPointer < m) {
             answer.add(mArray[mPointer++]);
         }

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

        MainA T = new MainA();

        for (int value : T.solution(n, nArray, m, mArray)){
            bw.write(String.valueOf(value) + " ");
        }

        bw.flush();
        bw.close();

    }
}
