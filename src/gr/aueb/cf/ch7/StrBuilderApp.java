package gr.aueb.cf.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        StringBuilder sb = new StringBuilder();

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            concatStr += i;
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;


        System.out.println("String Elapsed Time: " + stringElapsedTime + " Seconds");
        System.out.println("Sb Elapsed Time: " + sbElapsedTime + " Seconds");
    }
}
