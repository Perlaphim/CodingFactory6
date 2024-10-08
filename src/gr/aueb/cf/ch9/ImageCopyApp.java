package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopyApp {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:/tmp/kefali.jpg");
             FileOutputStream fos = new FileOutputStream("C:/tmp/kefali-out.jpg")) {

            int b;
            int count = 0;
            long start;
            long end;
            double elapsedTime = 0.0;

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                count++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("Το αρχείο με μέγεθος %d KB (%d bytes) αντιγράφηκε επιτυχώς\n", count / 1024, count);
            System.out.println("Elapsed Time: " + elapsedTime + " seconds");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
