package school.management.system;

import java.util.ArrayList;

import school.management.system.School;
import school.management.system.Student;
import school.management.system.Teacher;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy=new Teacher(1, "Lizzy", 500);
        Teacher mellisa=new Teacher(2, "Mellisa", 700);
        Teacher elsa=new Teacher(3, "Elsa", 600);


        List<Teacher>teacherList=new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(elsa);


        Student jk=new Student(1, "JK", 12);
        Student Saran=new Student(3,"Saran",4);
        Student rabbi=new Student(2, "Rabbi", 10);

        List<Student>studentList=new ArrayList<>();
        studentList.add(jk);
        studentList.add(Saran);
        studentList.add(rabbi);

        School gfg=new School(teacherList,studentList);
    
        jk.payFees(500);
        Sharan.payFees(6000);
        System.out.println("GHS has earned $"+gfg.getTotalMoneyEarned());
        System.out.println("--MAKING GFG PAY SALARY FOR TEACHERS");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GFg has spent salary to"+lizzy.getName()+"and now GFG has"+gfg.getTotalMoneyEarned());








    }
    
}
