package gr.aueb.cf.ch6;

public class TraverseArrayApp {

    public static void main(String[] args) {

        int[] ages = {20, 25, 22, 40};

        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i] + " ");
        }


        //enhanced form
        for (int age: ages){
            System.out.println(age + " ");
        }
    }
}
