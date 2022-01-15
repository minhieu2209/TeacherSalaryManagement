package model;

public class TeachingManagement {
    private Subject subjects;
    private Teacher teachers;
    private int numClass;

    public TeachingManagement(Subject subjects, Teacher teachers, int numClass) {
        this.subjects = subjects;
        this.teachers = teachers;
        this.numClass = numClass;
    }

    public TeachingManagement() {

    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }

    public Teacher getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public int getNumClass() {
        return numClass;
    }

    public void setNumClass(int numClass) {
        this.numClass = numClass;
    }
}
