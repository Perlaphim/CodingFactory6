package gr.aueb.cf.ch6.prct6B;

public class ReducingApp {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Total: " + getTotal(arr));
        System.out.printf("Average: %.2f", getAvrg(arr));
    }

    public static int getTotal(int[] arr) {
        int sum = 0;
        
        if (arr == null) return 0;

        for (int item : arr) {
            sum += item;
        }
        return sum;
    }
    

    public static double getAvrg(int[] arr) {

        return (double) getTotal(arr)/arr.length;
    }
}
