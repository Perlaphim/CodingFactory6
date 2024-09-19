package gr.aueb.cf.ch2.xmpls;

public class TypecastApp {
    public static void main(String[] args) {
        int myInt = 10;
        long myLong = 20L;
        int myResultInt = 0;
        long myResultLong = 0L;

        myInt = (int) myLong;
        myLong = myInt;

        myResultInt = myInt + (int )myLong;
        myResultLong = myInt + myLong;
        myResultLong = myInt;
    }
}
