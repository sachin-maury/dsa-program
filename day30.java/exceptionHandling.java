import java.util.Scanner;
public class exceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int x = scanner.nextInt();
            int y = 10 / x;
            System.out.println("Result: " + y);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
            scanner.close();
        }
    }
}

