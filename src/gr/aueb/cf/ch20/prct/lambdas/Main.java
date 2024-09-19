package gr.aueb.cf.ch20.prct.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static final List<Teacher> teachers = Arrays.asList(
            new Teacher(1, "A.", "Cooper"),
            new Teacher(2, "A.", "Wonderland"),
            new Teacher(3, "B.", "Gates"),
            new Teacher(4, "M.", "Azaiza")
    );

   public static List<Teacher> getFilteredTeachers(List<Teacher> teachers, Predicate<Teacher> filter) {
        List<Teacher> teachersToReturn = new ArrayList<>();
        for (Teacher teacher : teachers) {
            if (filter.test(teacher)) {
                teachersToReturn.add(teacher);
            }
        }
        return teachersToReturn;
   }

    public static void main(String[] args) {
        List<Teacher> filteredTeachers = getFilteredTeachers(teachers, teacher -> teacher.getId() == 3);
        teachers.forEach(Teacher::printTeacher);
        teachers.forEach(Teacher::printFullname);
        teachers.forEach(System.out::println);
    }
}
