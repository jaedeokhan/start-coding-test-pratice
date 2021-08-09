package coding.Section07.E08_송아지_찾기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    int[] dis = {1, -1, 5};
    int[] checked;
    Queue<Integer> queue = new LinkedList<>();

    public int BFS(int start, int end) {

        checked = new int[10001];
        checked[start] = 1;
        queue.offer(start);
        int level = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();

            for (int i = 0; i < length; i++) {
                int parentValue = queue.poll();
                for (int j = 0; j < dis.length; j++) {
                    int childValue = parentValue + dis[j];
                    if (childValue == end) return ++level;
                    if (childValue >= 1 && childValue <= 10000 && checked[childValue] == 0){
                        checked[childValue] = 1;
                        queue.offer(childValue);
                    }
                }
            }
            level++;
        }

        return level;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int e = scanner.nextInt();
        System.out.println(T.BFS(s, e));
    }
}
