import java.io.*;
class student {
public static void main(String[] args) throws IOException {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
System.out.println("TAKSHASHILA UNIVERSITY");
System.out.println("-------------------------------------");
System.out.println("Enter Student mark list");
System.out.println("Enter the Enroll no:");
String S1 = br.readLine();
System.out.println("Enter the Student Name:");
String S2 = br.readLine();
System.out.println("Enter the Java mark:");
String S3 = br.readLine();
int a = Integer.parseInt(S3);
System.out.println("Enter the Python mark:");
String S4 = br.readLine();
int b = Integer.parseInt(S4);
System.out.println("Enter the HTML mark:");
String S5 = br.readLine();
int c = Integer.parseInt(S5);
int total = a + b + c;
int avg = total / 3;
System.out.println("Result");
System.out.println("Total : " + total);
System.out.println("Average: " + avg);
}
}
