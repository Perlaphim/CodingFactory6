package gr.aueb.cf.ch4.xmpls;
/*
 * εκτιπώνει 10 γραμμές από αστεράκια σε αύξουσα σειρά
 */
public class Starts10AscApp {

    public static void main(String[] args) {

        for (int i = 1; i<=10; i++) {
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
