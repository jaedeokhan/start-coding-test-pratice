package fun.coding.sliver05.E01_크로아티아_알파벳_2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // sliver05 - 2941번 - 크로아티아 알파벳
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int wordLength = word.length();
        int count = 0;

        for (int i = 0; i < word.length(); i++){

            char alpha = word.charAt(i);

            if (alpha == 'c' && i < wordLength - 1) { // 만약 alpha가 c라면?
                if (word.charAt(i + 1) == '=' || word.charAt(i + 1) == '-'){ // c=, c-
                    i++;
                }
            } else if (alpha == 'd' && i < wordLength - 1){
                if (word.charAt(i + 1) == '-') { // d-
                    i++;
                } else if (i < wordLength - 2 && word.charAt(i + 1) == 'z'){
                    if (word.charAt(i + 2) == '=') { // dz=
                        i += 2;
                    }
                }
            } else if ((alpha == 'l' || alpha == 'n') && i < wordLength - 1) {
              if (i < word.length() - 1 && word.charAt(i + 1) == 'j'){ // lj
                  i++;
              }
            } else if ((alpha == 's' || alpha == 'z') && i < wordLength - 1){
                if (i < word.length() - 1 && word.charAt(i + 1) == '=') { // s=
                    i++;
                }
            }

            count++;
        }

        // a e d z d z = l s = c
        //

        System.out.println(count);
    }
}
