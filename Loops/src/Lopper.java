import java.time.LocalDate;

public class Lopper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Printing current time here");
		LocalDate today = LocalDate.now();
		System.out.println("date is " + today);

		String[] days = { "Monday", "Tuesday", "Wednessday" };
		longestDay nd = new longestDay();
		nd.calday(days);
		nd.revertdays(days);

		/*
		 * Scanner scanner = new Scanner(System.in);
		 * System.out.println("Enter the number to check if it a prime or not"); int n =
		 * scanner.nextInt();
		 * 
		 * // Isprime check = new Isprime(); // check.isPrime(n);
		 * 
		 * System.out.println("Printing a number traingle"); for (int i = 1; i <= 5;
		 * i++) { for (int j = 1; j <= i; j++) { System.out.print(j); }
		 * System.out.println("\n"); }
		 */

	}

}