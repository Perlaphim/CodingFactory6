package gr.aueb.cf.ch4.xmpls;

public class InternalForApp {

    public static void main(String[] args) {
        int counter = 0;

        for (;;) {
            System.out.println("CF forever ");
            counter++;

            if (counter % 20 == 0){
                System.out.println();
            }

            if (counter == 100){
                break;
            }
        }
    }
}
