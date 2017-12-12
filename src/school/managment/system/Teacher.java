package school.managment.system;

public class Teacher {
    private int id;
    private String name;
    private int salaryEarned;
    private int salary;
    public Teacher (int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }
    public String getName(){
        return name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getId(){
        return id;
    }
    public int getSalary(){
        return salary;
    }
    public void reciveSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

}
