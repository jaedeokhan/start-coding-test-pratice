package section02.E03_가위바위보;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    private static final int SCISSORS = 1;
    private static final int ROCK = 2;
    private static final int PAPER = 3;


    public char[] solution(int n, int[] peopleA, int[] peopleB){

        char[] answer = new char[n];

        // 입력 : 게임 횟수(N) - 1 <= N <= 100
        //        A가 낸 가위, 바위, 보 정보
        //        B가 낸 가위, 바위, 보 정보
        // 출력 : 각 회의 승자 출력, 비겨면 D

        for (int i = 0; i < n; i++){
            // 비기면
            if (peopleA[i] == peopleB[i]) {
                answer[i] = 'D';
                continue;
            }
            // A가 이기면
            if ((peopleA[i] == SCISSORS && peopleB[i] == PAPER) ||
                (peopleA[i] == ROCK && peopleB[i] == SCISSORS) ||
                (peopleA[i] == PAPER && peopleB[i] == ROCK)){
                answer[i] = 'A';
            } else {
                answer[i] = 'B';
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer stA = new StringTokenizer(br.readLine());
        StringTokenizer stB = new StringTokenizer(br.readLine());
        int[] peopleA = new int[n];
        int[] peopleB = new int[n];

        for (int i = 0; i < n; i++){
            peopleA[i] = Integer.parseInt(stA.nextToken());
            peopleB[i] = Integer.parseInt(stB.nextToken());
        }

        for (char alpha : T.solution(n, peopleA, peopleB)) {
            bw.write(alpha);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
