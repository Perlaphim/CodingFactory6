package gr.aueb.cf.ch3.xmpls;

public class Mul10App {

    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while (i <= 10){
            mul += i;
            System.out.println(mul);
            i++;
        }
    }
}
