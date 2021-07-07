package coding.section05.E03_크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main_A {

    public int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> items = new Stack<>();

        for (int pos : moves){
            for (int i = 0; i < board.length; i++){
                if (board[i][pos-1] != 0){
                    int currentItem = board[i][pos-1];
                    board[i][pos-1] = 0;
                    if (!items.isEmpty() && currentItem == items.peek()){
                        answer += 2;
                        items.pop();
                    } else items.push(currentItem);
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][] board = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = scan.nextInt();
            }
        }
        int m = scan.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++){
            moves[i] = scan.nextInt();
        }

        System.out.println(T.solution(n, board, m, moves));
    }
}
