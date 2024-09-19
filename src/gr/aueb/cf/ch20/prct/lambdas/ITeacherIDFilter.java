package gr.aueb.cf.ch20.prct.lambdas;

@FunctionalInterface
public interface ITeacherIDFilter {
    boolean filteredID(Teacher teacher);
}
