package gr.aueb.cf.ch17.prct.marker;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book.Builder(1,"123").build();
        Book b2 = new Book.Builder(2,"345")
                .author("Th.")
                .title("Java I")
                .build();

        System.out.println(b1);
        System.out.println(b2);
    }
}
