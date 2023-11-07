package main.java.com.safiq.employee;

import main.java.com.safiq.calculation.Calculation;

public class Employee implements Calculation{
    private int age;
    private String name;
    private int month;
    private int dailyIncome;
   public void setDailyIncome(int income){
        this.dailyIncome=income;
    }
    public int getDailyIncome(){
        return dailyIncome;
    }

    public void setMonth(int m) {
        this.month = m;
    };

    public int getMonth() {
        return month;
    }

    Employee(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public double employeeSalary;

    Employee(int age, String name, double salary) {
        this.age = age;
        this.name = name;
        this.employeeSalary = salary;
    }

    public Employee(Double salary) {
        this.employeeSalary = salary;
    }

    public int calCulateSalary() {
        int salary = month * dailyIncome * 30;
        return salary;
    }

    public Employee() {
    }
    @Override
    public int add(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public int dividNumber(int x, int y) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dividNumber'");
    }
    @Override
    public int multiply(int x, int y) {
        if ( x>0 && y>0) {
            return x*y;
        }
        return 0;
    }
}
