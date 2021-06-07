package coding.test.bronze3;

import java.util.Scanner;

public class E01_최소_최대_a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] num_array = new int[num];
        int largest = -2148000;
        int smallest = 2148000;

        for (int i = 0; i < num; i++) {
            num_array[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            if (num_array[i] > largest){
                largest = num_array[i];
            }

            if (num_array[i] < smallest) {
                smallest = num_array[i];
            }
        }

        System.out.println(smallest + " " + largest);

    }
}
