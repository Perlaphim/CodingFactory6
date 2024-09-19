package gr.ergasies.erg9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Location {

    public static void main(String[] args) {
        String[] cities = {};
        String str;


        try (BufferedReader bf = new BufferedReader(new FileReader("C:/tmp/locations.txt"));
             PrintStream ps = new PrintStream(new FileOutputStream("C:/tmp/locationsOut.txt"));) {
            boolean isFirstLine = true;

            while ((str = bf.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                cities = str.split(",");
                if (cities.length == 3) {
                    String city = cities[0];
                    String latitude = cities[1];
                    String longitude = cities[2];

                    print(ps, city, latitude, longitude);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
        public static void print(PrintStream ps, String location, String latitude, String longitude){
            ps.println("{ Location: " + location + ", Latitude: " + latitude + ", longitude: " + longitude + " }");
    }
}
