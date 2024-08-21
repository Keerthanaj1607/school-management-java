package school.management.system;

import school.management.system.Student;
import school.management.system.Teacher;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
   
    private static  int totalMoneyEarned;
    private  static int totalMoneySpent;
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public void addTeacher(Teacher teacher) {
     teachers.add(teacher);
    }
    public List<Student> getStudents() {
        return students;
    }
    public void addStudent(Student student) {
         students.add(student);
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
    /**
     * 
     * @param MoneyEarned money that supposed to be added
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    /**
     * 
     * @param MoneySpent update the money spent by the school which is the salary given  to its teachers
     */
    public  static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
    }
    
    
}
