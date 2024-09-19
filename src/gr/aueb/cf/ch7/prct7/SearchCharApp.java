package gr.aueb.cf.ch7.prct7;

public class SearchCharApp {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";
        int index = -1;

        if (s.contains("Economics")) System.out.println("Bingo");

        index = s.indexOf("uni");
        System.out.println("Start Index of Uni" + index);

        index = s.indexOf("t",7);
        System.out.println("Start Index of 't'" + index);

        index = s.lastIndexOf("s");
        System.out.println("Start Index of 's'" + index);


        if (s.startsWith("Uni")) System.out.println("Bingo");
        if (s.endsWith("ness")) System.out.println("Bongo");
    }
}
