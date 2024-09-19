package gr.aueb.cf.ch4.xmpls;
/*
 * εκτυπώνει 10 αστεράκια
 */
public class Stars10App {

    public static void main(String[] args) {

        for (int j = 1; j<=10; j++){
            for (int i = 1; i<= 10; i++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
