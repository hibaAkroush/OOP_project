package school.managment.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPayed;
    private int feesTotal;

    public Student(int id, String name, int grade) {
        this.feesPayed = 0;
        this.feesTotal = 2000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees) {
        feesPayed += fees;
        School.updateTotalMoneyEarned(fees);
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

    public int getFeesPayed() {
        return feesPayed;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int remainingFees (){
        feesTotal -= feesPayed;
                return feesTotal;
    }

    @Override
    public String toString() {
        return "student name: " + name + ". and " +
                " fees payed so far: " + feesPayed;
    }
}