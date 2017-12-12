package school.managment.system;
import school.managment.system.School;
import school.managment.system.Student;
import school.managment.system.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher hiba = new Teacher(1,"hiba",500);
        Teacher lisa = new Teacher(1,"lisa",700);
        Teacher darthVader = new Teacher(1,"Darth Vader",5000);
        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(lisa);
        teachersList.add(hiba);
        teachersList.add(darthVader);

        Student luke = new Student(1,"luke",4);
        Student saleem = new Student(2,"saleem",5);
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(luke);
        studentsList.add(saleem);

        School HighSchool = new School(teachersList,studentsList);
        saleem.payFees(300);
        System.out.println("you have earned $" + HighSchool.getTotalMoneyEarned());
        luke.payFees(600);
        System.out.println("you have earned $" + HighSchool.getTotalMoneyEarned());
        System.out.println("making school pay for teachers");
        hiba.reciveSalary(hiba.getSalary());
        System.out.println("payed salary for "+ hiba.getName()+" amount of "+ hiba.getSalary() + " now the school has "+ HighSchool.getTotalMoneyEarned());

        System.out.println(luke);
    }
}
