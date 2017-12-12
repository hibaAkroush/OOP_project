package school.managment.system;

import school.managment.system.Student;
import school.managment.system.Teacher;

import java.util.List;

public class School {
    List<Student> students;
    List<Teacher> teachers;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;
    public School (List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0 ;
        totalMoneySpent = 0;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    public static void updateTotalMoneySpent(int MoneySpent) {
       totalMoneyEarned -= MoneySpent;
    }
}
