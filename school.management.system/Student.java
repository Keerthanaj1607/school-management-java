package school.management.system;
/*
 * This class is responsible for tracking:
 * students fees
 * id
 * name 
 * grade
 * fees paid
 */
public class Student{
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
    /**
     * construcor for initializing
     * Fees for every student $30,000
     * Fees paid initially is 0
     * @param id id for the student:unique
     * @param name name of the student
     * @param grade grade of the student
     */

    public Student(int id,String name,int grade){
        this.feesPaid=0;
       this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }
    // not going to alter student's name or id-no seeters
    /**
     * Used to update student's grade
     * @param grade new grade of the student
     */
    public void setGrade(int grade){
        this.grade=grade;
    }
    /**
     *  Add fees to the feesPaid
     * the school is receiving fees from the student
     * @param fees fees that student pays
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int getFeesPaid() {
        return feesPaid;
    }
    public int getFeesTotal() {
        return feesTotal;
    }
    /**
     * 
     * @param fees
     */
    



}
