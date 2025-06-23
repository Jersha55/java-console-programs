import java.io.*;
class supermarket {
public static void main(String[] args) {
try {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("WELCOME YOU!!");
System.out.println("JERSHA SUPER MARKET");
System.out.println(" Main Road, Chennai");
System.out.println("-------------------------------");
System.out.println("BILL");
System.out.println("-------------------------------");
System.out.print("Enter the serial no: ");
String s1 = br.readLine();
int serialNo = Integer.parseInt(s1);
System.out.print("Enter the particulars: ");
String particulars = br.readLine();
System.out.print("Enter the rate: ");
String s3 = br.readLine();
int rate = Integer.parseInt(s3);
System.out.print("Enter the quantity: ");
String s4 = br.readLine();
int quantity = Integer.parseInt(s4);
System.out.println("Result");
int total = rate * quantity;
System.out.println("Total Amount: " + total);
int average = total * 10 / 100;
System.out.println("Average (10% of total): " + average);
int grandTotal = total + average;
System.out.println("Grand Total: " + grandTotal);
System.out.println("-------------------------------");
System.out.println("Thanks! Visit Again!");
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
