package com.bharath.oops.assignment;

 class Employee {

  public String employeeName;
  public int employeeID;
  public Employee(String employeeName, int employeeID){
   this.employeeID = employeeID;
   this.employeeName = employeeName;
  }
  public void salary(int numberOfWorkingDays){

  }


}
class FullTimeEmployee extends Employee{


 public FullTimeEmployee(String employeeName, int employeeID) {
  super(employeeName, employeeID);
 }

 @Override
 public void salary(int numberOfWorkingDays){

 System.out.println("Full Time Employee Name :: "+employeeName+ " Employee ID :: " +employeeID +", salary is "+ numberOfWorkingDays*200+" for "+numberOfWorkingDays+" days");
}
}
class PartTimeEmployee extends Employee{

 public PartTimeEmployee(String employeeName, int employeeID) {
  super(employeeName, employeeID);
 }

 @Override
 public void salary(int numberOfWorkingDays){

  System.out.println("Part time Employee Name :: "+employeeName+ ", Employee ID :: " +employeeID +" salary is "+ numberOfWorkingDays*150+" for "+numberOfWorkingDays+"days");
 }
}
public class Inheritance{

 public static void main(String[] args) {


  Employee sravani = new FullTimeEmployee("Sravani",1234);
  Employee nivedha = new FullTimeEmployee("nivedha",12349);

sravani.salary(12);
nivedha.salary(10);

  Employee krishnaveni = new PartTimeEmployee("Krishnaveni",1789);
  Employee ruthvik = new PartTimeEmployee("Ruthvik",1989);
  krishnaveni.salary(20);
  ruthvik.salary(10);

}
 }