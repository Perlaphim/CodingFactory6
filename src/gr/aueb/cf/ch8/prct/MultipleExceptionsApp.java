package gr.aueb.cf.ch8.prct;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MultipleExceptionsApp {

    public static void main(String[] args) {
        File file = new File("C:\\tmp\\random-file.txt");

        try (Scanner in = new Scanner(System.in)){
            char ch = (char) System.in.read();
            int num = in.nextInt();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
