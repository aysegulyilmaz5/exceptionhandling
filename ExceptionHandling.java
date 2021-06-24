package exceptionhandling;


import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	
	public static int quotient(int numerator,int denominator)
		throws ArithmeticException
		{
			return numerator/denominator;
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continueLoop = true;
		
		do{
			try {
				System.out.printf("Please enter an integer numerator:");
				int numerator = scanner.nextInt();
				System.out.printf("Please enter an integer denominator:");
				int denominator = scanner.nextInt();
				
				int result = quotient(numerator,denominator);
				System.out.printf("\nResult: %d / %d = %d\n",numerator,denominator,result);
				continueLoop = false;
			}
			catch(InputMismatchException inputMismatchException) {
				System.out.printf("\nException: %s\n", inputMismatchException);
				scanner.nextLine();
				System.out.println("You must enter integers.Please try again");
			}
			
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n", arithmeticException);
				System.out.println("Zero is an invalid denominator.Please try again\n");
			}
			
		}while(continueLoop);
	}
	

}
