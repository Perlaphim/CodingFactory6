package gr.aueb.cf.ch6;

public class SearchPositionApp {

    public static void main(String[] args) {
        final int EXCELENT_GRADE = 10;
        int[] grades = {6,3,8,9,1,10};
        int position = -1;

        for (int i=0; i<grades.length; i++){
            if (grades[i] == EXCELENT_GRADE) {
                position = i;
                break;
            }
        }

        if (position == -1){
            System.out.println("NOT FOUND");
        } else {
            System.out.printf("The element %d was found at the position %d", EXCELENT_GRADE, position + 1);
        }
    }
}
