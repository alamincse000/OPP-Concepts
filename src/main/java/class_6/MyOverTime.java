package class_6;

public class MyOverTime {
    public static void main(String[] args) {
        Salary salary = new Salary();
       int mySalary = salary.calculateSalary(500,8,2);
        System.out.println(mySalary);

    }
}
class Salary{
    public int calculateSalary(int salary,int hr){
        return salary*hr;

    }
    public int calculateSalary(int salary, int hr,int overtime){
        return salary*hr +(600*overtime);

    }
}
