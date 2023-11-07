package main.java.com.safiq.app;

import main.java.com.safiq.employee.Employee;

public class MainApp {

 public static void main(String[] arg){
  Employee employee =new Employee();
  employee.setAge(23);
  employee.setName("Shafiqul Islam");
  employee.setEmployeeSalary(130);
  employee.setDailyIncome(230);
  employee.setMonth(4);
  System.out.println();
  System.out.println();
  System.out.println();
  int mySalary=employee.calCulateSalary();
  System.out.println(mySalary);
  int mul=employee.multiply(5, 8);
  System.out.println(mul);
   
 }
    
}
