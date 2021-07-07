package coding.section05.E03_크레인_인형뽑기;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    // Stack<Integer> items set
    // 1. for문 i를 0부터 moves.length 까지 돌린다.
    // 1-1. for문 j를 0부터 n까지 돌린다.
    // 1-1-1. if (board[j][moves[i]-1] != 0) // 각 행의 0 이 아닌 뽑을 인형이 있다면
    // 1-1-1-1. items.push(moves[i])
    // 1-1-1-2. if (items.isEmpty()) items.push(board[j][moves[i]-1]; // 인형의 갯수가 0개이면
    // 1-1-1-3. else // 인형의 갯수가 1개 이상이면
    // 1-1-1-3-1. if (items.peek() == borad([j][moves[i]-1])) // items Stack에 맨 위와 현재 아이템이 같으면
    // 1-1-1-3-1-1. itmes.pop();
    // 1-1-1-3-1-2. answer += 2;
    // 1-1-1-3-2. else // items Stack의 맨 위와 현재 값이 같지 않으면
    // 1-1-1-3-2-1. itmes.push(board([j][moves[i]-1]));
    // 1-1-1-4. board[j][moves[i]-1] = 0; // 사용한 인형의 자리를 0 으로 변경
    // 1-1-1-5. break;

    public int solution(int n, int[][] board, int m, int[] moves) {

        int answer = 0;
        Stack<Integer> items = new Stack<>();

        for (int i = 0; i < moves.length; i++){
            for (int j = 0; j < n; j++){
                int currentItem = board[j][moves[i]-1];
                if (currentItem != 0){ // board의 해당하는 열에 뽑을 인형이 존재한다면
                    if (items.isEmpty()) items.push(currentItem); // 인형이 없으면 items에 1개를 넣어준다
                    else { // items Stack에 인형이 1개 이상이면
                        if (items.peek() == currentItem){ // Stack의 가장 늦게 들어간 값과 일치한다면
                            items.pop(); // 동일한 값을 하나 pop() 해준다
                            answer += 2; // 인형을 두 개를 뺀거니 answer += 2 복합 연산
                        } else { // Stack에 하나 이상 값이 있지만, 마지막에 들어간 값이 일치하지 않다면
                            items.push(currentItem); // 일치하지 않으면 인형을 넣어준다.
                        }
                    }
                    board[j][moves[i]-1] = 0; // 인형을 사용했으니 board에서 인형이 있는 곳을 0으로 변경
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
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
