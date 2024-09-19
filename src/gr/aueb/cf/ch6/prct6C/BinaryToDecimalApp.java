package gr.aueb.cf.ch6.prct6C;

public class BinaryToDecimalApp {

    public static void main(String[] args) {
        int[] vector = {1,0,0,0,1,1,1,0};
        int decimal = binaryLittleEndianToDecimal(vector);
        System.out.println("Value :" + decimal);
    }

    public static int binaryBigEndianToDecimal(int[] binVector) {
        int n;
        int decimal = 0;

        if (binVector == null) {
            throw new IllegalArgumentException();
        }

        n = binVector.length;
        for (int i = n - 1; i >= 0; i--) {
            decimal = decimal + binVector[i] * (int) Math.pow(2, n-1-i);
        }

        return decimal;
    }



    public static int binaryLittleEndianToDecimal(int[] binVector) {
        int n;
        int decimal = 0;

        if (binVector == null) {
            throw new IllegalArgumentException();
        }

        n = binVector.length;
        for (int i = 0; i < n; i++) {
            decimal = decimal + binVector[i] * (int) Math.pow(2, i);
        }

        return decimal;
    }
}
