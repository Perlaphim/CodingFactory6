package gr.aueb.cf.ch3.xmpls;

/**
 * υπολογίζει το 1,2,3,4,...,10 με while do
 */
public class Sum10App {

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i<=10){
            sum += i; // sum = sum + i;
            System.out.println(sum);
            i++;
        }


    }
}
