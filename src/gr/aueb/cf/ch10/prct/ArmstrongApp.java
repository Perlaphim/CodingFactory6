package gr.aueb.cf.ch10.prct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongApp {

    public static void main(String[] args) {
        final Scanner in = new Scanner(System.in);
        final List<Integer> digits = new ArrayList<>();
        int inputNumber = 0;
        int digitsCount = 0;
        int num = 0;
        int sum = 0;
        int digit = 0;
        Boolean isArmstrong = false;


        System.out.println("Please insert a number (int)");
        inputNumber = in.nextInt();

        num = inputNumber;

        //Find digits count
        do {
            digitsCount++;
            digit = num % 10;
            digits.add(digit);
            num = num/10;
            System.out.println(digits);
        } while (num !=0);

        //Find sum
        for (int item : digits) {
            sum += Math.pow(item, digitsCount);
        }

        isArmstrong = (sum == inputNumber);


        System.out.println("The number is: " + inputNumber);
        System.out.println("The Sum is: " + sum);
        System.out.printf("Is %d an Armstrong: %s", inputNumber, (isArmstrong) ? "Yes" : "No");
    }
}
