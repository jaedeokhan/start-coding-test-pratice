package coding.section06.E07_좌표_정렬;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Point implements Comparable<Point> {
    public int x, y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o){
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }

}

public class Main_A {

    public ArrayList<Point> solution(int n, ArrayList<Point> array) {

        Collections.sort(array);

        return array;
    }

    public static void main(String[] args) {

        Main_A T = new Main_A();
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        ArrayList<Point> array = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            array.add(new Point(x, y));
        }

        for (Point points : T.solution(n, array)){
            System.out.println(points.x + " " + points.y);
        }
    }
}
