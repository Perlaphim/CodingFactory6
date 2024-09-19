package gr.aueb.cf.ch16.prct.inh;

import java.awt.print.Book;

public class TalkingBook implements ITalking {

    @Override
    public void read() {

        System.out.println("Can be read");
    }

    @Override
    public void speak() {
        System.out.println("Can speak");
    }
}
