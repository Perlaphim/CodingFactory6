package gr.aueb.cf.ch6.prct6B;

/**
 *
 * Demonstrates Array mapping
 *
 */

public class MappingApp {

    public static void main(String[] args) {

        int[] salaries = {1000,1200,900,1700};
        final double BONUS = 0.25;
        double[] wages = getDoubleWages(salaries,BONUS);

        for (double wage : wages) {
            System.out.println(wage + " ");
        }
    }


    public static double[] getDoubleWages(int[] arr, double bonus) {
        if (arr == null) return null;
        double[] raises = new double[arr.length];

        for (int i=0; i < raises.length; i++) {
            raises[i] = arr[i] + arr[i] * 0.25;
        }
        return raises;
    }
}
