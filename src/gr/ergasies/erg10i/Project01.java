package gr.ergasies.erg10i;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Project01 {
//
//    public static void main(String[] args) throws FileNotFoundException {
//        int[] arr = new int[0];
//        int i = -1;
//        String str = " ";
//        int count = 0;
//        int dig = 0;
//        int num = 0;
//
//        try (BufferedReader in = new BufferedReader(new FileReader("C:/tmp/Project01.txt"));
//             PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/Project01out.txt"), true, StandardCharsets.UTF_8)) {
//            while ((str = in.readLine()) != null) {
//                str = in.nextLine();
//                if (str.startsWith(" ")) {
//                    in.next();
//                }
//                while (!isInt(str)) {
//                    count++;
//                }
//
//                arr = new int[count];
//            }
//
//            while (in.hasNextLine()) {
//                str = in.nextLine();
//                if (str.startsWith(" ")) {
//                    in.next();
//                }
//                while (isInt(str)) {
//                    dig = Integer.parseInt(str);
//                    num += dig;
//                }
//                arr[++i] = num;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public static boolean isInt(String str) {
//        try {
//            Integer.parseInt(str);
//            return true;
//        } catch (NumberFormatException e) {
//            return false;
//        }
//    }
}
