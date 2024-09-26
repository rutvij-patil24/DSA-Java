import java.util.Scanner;

public class exceptionHandling {
    public static int divideNumbers(int n, int d) throws ArithmeticException {
        return n / d;  // This can throw an ArithmeticException (division by zero)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Scanner to take input from user
        
        System.out.print("Enter the numerator: ");
        int num = sc.nextInt();

        System.out.print("Enter the denominator: ");
        int deno = sc.nextInt();

        try{
            int result = divideNumbers(num, deno);
            System.out.println("Result: " + result);
        } 
        catch(ArithmeticException e){
            // Catch block to handle the exception
            System.out.println("Error: Cannot divide by zero.");
        } 
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            // This block always runs, regardless of exception
            System.out.println("Division attempt completed.");
        }

        System.out.println("Bye");

        sc.close();  // Close the scanner
    }
}
