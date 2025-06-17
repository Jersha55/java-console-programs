import java.io.*;

class arith {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("ARITHMETIC OPERATIONS");
        System.out.println("-------------------------------------");

        System.out.print("Enter the First Number: ");
        String S1 = br.readLine();
        int a = Integer.parseInt(S1);

        System.out.print("Enter the Second Number: ");
        String S2 = br.readLine();
        int b = Integer.parseInt(S2);

        System.out.println("\nRESULT");
        int c = a + b;
        System.out.println("Add: " + c);

        int d = a - b;
        System.out.println("Sub: " + d);

        int e = a * b;
        System.out.println("Mul: " + e);

        if (b != 0) {
            int f = a / b;
            int g = a % b;
            System.out.println("Div: " + f);
            System.out.println("Mod: " + g);
        } else {
            System.out.println("Div: Cannot divide by zero");
            System.out.println("Mod: Cannot find remainder with zero divisor");
        }
    }
}
