import java.io.*;
class salarybill {
public static void main(String[] args) {
try {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("JERSHH INTERNATION [P] Ltd.");
System.out.println("Chennai");
System.out.println("-----------------------------");
System.out.println("Salary Bill Receipt");
System.out.println("-----------------------------");
System.out.print("Enter the Employee Id: ");
String s1 = br.readLine();
int empId = Integer.parseInt(s1);
System.out.print("Enter the Employee Name: ");
String s2 = br.readLine();
System.out.print("Enter the Salary: ");
String s3 = br.readLine();
int salary = Integer.parseInt(s3);
System.out.println("INCOME");
int bonus = salary * 30 / 100;
System.out.println("Bonus (30% from salary): " + bonus);
int increment = salary * 10 / 100;
System.out.println("Increment (10% from salary): " + increment);
int overtime = salary * 5 / 100;
System.out.println("Overtime (5% from salary): " + overtime);
int grandTotal = bonus + increment + overtime + salary;
System.out.println("Grand Total: " + grandTotal);
System.out.println("EXPENDITURE");
int lic = salary * 2 / 100;
System.out.println("LIC (2% from salary): " + lic);
int hra = salary * 3 / 100;
System.out.println("HRA (3% from salary): " + hra);
int netTotal = grandTotal - lic - hra;
System.out.println("Net Total: " + netTotal);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
