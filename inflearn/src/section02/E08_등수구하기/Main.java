package section02.E08_등수구하기;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(int n, int[] scores){

        // 입력 : 첫 줄 N(3 <= N <= 100)
        //        두 번째 줄 N개의 국어점수
        // 출력 : 순서대로 등수

        // 조건 : 같은 등수가 입력될 경우 높은 등수로 동일 처리

        int[] rank = new int[n];

        for (int i = 0; i < n; i++){
            int count = 1;
            for (int j = 0; j < n; j++){
                if (scores[j] > scores[i]){
                    count++;
                }
            }
            rank[i] = count;
        }

        return rank;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] scores = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++){
            scores[i] = Integer.parseInt(st.nextToken());
        }

        for (int score : T.solution(n, scores)){
            bw.write(String.valueOf(score) + " ");
        }

        bw.flush();
        bw.close();
    }
}
