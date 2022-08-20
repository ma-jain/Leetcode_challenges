import java.util.Scanner;
import java.io.*;

public class morse_code {
    public static void main(String[] args) {
        // Scanner scn= new Scanner(System.in);
        String[] words = { "gin", "zen", "gig", "msg" };
        String morse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--",
                "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        // String
        // morse[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};
        int l = words.length;
        // String[] mor=new String[12]; // String to put morse code together
        String[] ans = new String[100]; // String to store the morse codes of the words
        int i = 0, j;
        int count = 1; // to store the count of the unique morse
        for (i = 0; i < l; i++) { // loop for each word
            // String x="";
            for (j = 0; j < words[i].length(); j++) { // loop for each letter of word

                char eng = words[i].charAt(j); // get each letter of the word
                // System.out.println(eng);
                int pos = eng - 97; // to take morse code and store the letters positon in 26 alphabets

                if (j == 0) { // initialising the array or error
                    ans[i] = morse[pos];
                    continue;
                }

                ans[i] = ans[i].concat(morse[pos]); // attaching morse of eache letter
            }

        }
        
        for (i = 1; i < l; i++) {  //loop to count the unique morse code

            for (j = 0; j < i; j++) {
                System.out.println(ans[i]);
               
                if (ans[i].equals(ans[j])) {
                    break;
                }
            }
            if (j == i)
                count++;

        }
        System.out.println(count);
    }
}