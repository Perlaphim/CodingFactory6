package gr.aueb.cf.ch4.xmpls;

/*
 * print the whole range of emojis
 * Range: 1F600 - 1F64F
 */

public class EmojisApp {

    public static void main(String[] args) {
        int emoji = 0x1F600;
        int emojiEnd = 0x1F64F;
        int counter = 0;

        while (emoji <= emojiEnd){
            System.out.print(Character.toChars(emoji));
            System.out.print(" ");
            emoji++;
            counter++;
            if (counter % 16 == 0) {
                System.out.println();
            }
        }
    }
}
