import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the sales tax rate:");
      double sTR = scanner.nextDouble(); //sales tax rate
      System.out.println("How many boards do you need?");
      int boards = scanner.nextInt();
      System.out.println("How many windows do you need?");
      int windows = scanner.nextInt();
      Construction Construct = new Construction(8.00, 11.00, sTR);
      double total = Construct.lumberCost(boards) + Construct.windowCost(windows);
      System.out.println("Total: " + total);//prints the total amount
      System.out.print("Grand Total: ");
      System.out.print(Construct.grandTotal(total));
    }
}
