package coding.test.section1;

import java.util.Scanner;

public class E01_문자_찾기 {
    public static void main(String[] args){
        
        String input = "Computercooler";
        input = input.toLowerCase();
        int count = 0;
        
        Scanner scan = new Scanner(System.in);
        char alpha = scan.nextLine().charAt(0);

        System.out.println(alpha);

        for (int i = 0; i < input.length(); i++) {
            if (alpha == (input.charAt(i))){ 
                count += 1;
            }
        }   

        System.out.println(count);

    }
}