package school.management.system;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned
    /**
     * 
     * @param id id of the teacher
     * @param name name of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    /**
     * 
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    /**
     * Adds to SalaryEarned
     * Removes from the total money earnec from the school
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneyEarned(salary);


    }

}

