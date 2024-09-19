package gr.aueb.cf.ch5;

import java.io.IOException;

/**
 * Υπολογίζει το πλήθος των γραμμάτων καθώς
 * και το πλήθος των διπλών γραμμάτων. (# for end)
 */

public class CharCountAndDuplicateApp {

    public static void main(String[] args) throws IOException {
     char inputChar = ' ';
     int count = 0;
     char previousChar = '\u007f';
     int duplicate = 0;

     do {
         inputChar = (char) System.in.read();
         if (inputChar == '#'){
             break;
         }
         count++;

         if (inputChar == previousChar)
         {
             duplicate++;
         }

         previousChar = inputChar;
     }while (true);

     System.out.println("count: " + count);
     System.out.println("Duplicates: " + duplicate);
    }
}
