package employee.salery;
import java.lang.*; 
interface Gross 
{
 double ta=800.0;
 double da=1500.0; 
 void gross_sal();
}
class Employee 
{
 String name; 
 float basic_sal;
 
 Employee(String n, float b) 
 {
  name=n;
  basic_sal=b;
 }
 
 void display() 
 {
  System.out.println("Name of Employee : "+name);
  System.out.println("Basic Salary of Employee : "+basic_sal);
 }
}
 
class Salary extends Employee implements Gross 
{
 float hra;
 
 Salary(String n, float b, float h) 
 {
  super(n,b);
  hra=h;
 }
 
 void disp()
 {
  display();
  System.out.println("HRA of Employee : "+hra);
 }
 
 public void gross_sal() 
 {
  double gross_sal=basic_sal + ta + da + hra;
  System.out.println("TA of Employee : "+ta);
  System.out.println("DA of Employee : "+da);
  System.out.println("Gross Salary of Employee : "+gross_sal);
 }
}
 
public class EmployeeSalery {
 
 public static void main(String args[]) 
 {
  Salary s = new Salary("Sachin",8000,3000); 
  s.disp(); 
  s.gross_sal();
 }
}
