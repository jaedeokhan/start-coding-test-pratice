package section02.E01_큰_수_출력하기;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public int[] solution(int n, int[] numbers){

        List<Integer> answer = new ArrayList<>();
        answer.add(numbers[0]);

        for (int i = 1; i < n; i++){
            int currentNum = numbers[i];
            int previousNum = numbers[i - 1];

            if (currentNum > previousNum){
                answer.add(currentNum);
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++){
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int number : T.solution(n, numbers)){
            bw.write(String.valueOf(number) + " ");
        }

        bw.flush();
        bw.close();
    }
}
