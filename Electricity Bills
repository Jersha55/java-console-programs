import java.io.*;
class Bills {
public static void main(String[] args) {
try {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("GOVERNMENT OF TAMILNADU");
System.out.println("Electricity Bill");
System.out.println("---");
System.out.print("Enter the EB-no: ");
String ebNo = br.readLine();
System.out.print("Enter the customer name: ");
String customerName = br.readLine();
System.out.print("Enter the previous unit: ");
String prevUnitStr = br.readLine();
int prevUnit = Integer.parseInt(prevUnitStr);
System.out.print("Enter the current unit: ");
String currUnitStr = br.readLine();
int currUnit = Integer.parseInt(currUnitStr);
int unitConsumed = currUnit - prevUnit;
int amount = unitConsumed * 5; // Example rate: ₹5 per unit
System.out.println("\nResult");
System.out.println("EB Number      : " + ebNo);
System.out.println("Customer Name  : " + customerName);
System.out.println("Unit Consumed  : " + unitConsumed);
System.out.println("Total Amount   : ₹" + amount);
} catch (Exception e) {
System.out.println("Error: " + e.getMessage());
}
}
}
