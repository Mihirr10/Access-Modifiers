package com.accessmodifier;


import com.accessmodifier.employee.Employee;

public class Main {
  public static void main(String[] args) {

    Employee employee = new Employee();
    employee.employeeName = "Mihir";
    System.out.println("Employee Name:" + employee.employeeName);

    // employee.employeeId=101;//error:'employeeId' has protected access in 'com.accessmodifier.employee.Employee
    //employee.salary=10000;// error:'salary' has private access in 'com.accessmodifier.employee.Employee
    employee.setEmployeeId(101);
    employee.setSalary(10000);

    System.out.println("Employee id:" + employee.getEmployeeId());
    System.out.println("Employee Salary:" + employee.getSalary());
  }
}