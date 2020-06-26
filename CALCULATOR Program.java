import java.util.Scanner;
public class Calculator {
   public static void main(String[] args) {
      double n1;
      double n2;
      double result;
      char op;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter n1 and n2: ");
      n1 = s.nextDouble();
      n2 = s.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      op = s.next().charAt(0);
      switch(op) {
         case '+': result = n1 + n2;
            break;
         case '-': result = n1 - n2;
            break;
         case '*': result = n1 * n2;
            break;
         case '/': result = n1 / n2;
            break;
         default:  System.out.printf("Invalid operation");
            return;
	}
      System.out.print("\nResult is:\n");
      System.out.printf(n1 + " " + op + " " + n2 + " = " + result);
   }
}