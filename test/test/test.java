package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		DumClass dm = new DumClass();
		dm.fakemethod();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num1");
		int num1 = scanner.nextInt();
		System.out.println("Enter num2");
		int num2 = scanner.nextInt();

		Second childsecond = new Second(num1, num2);

		System.out.println("Enter Choice\n1. Addition\n2.Doubleme 3. Multiply\n");
		int choice = scanner.nextInt();

		switchtest(num1, num2, childsecond, choice);

	}

	private static void switchtest(int num1, int num2, Second childsecond, int choice) {

		switch (choice) {

		case 1:
			System.out.printf("Additon of %d and %d is %d", num1, num2, childsecond.add());
			break;
		case 2:
			childsecond.doubleme();
			System.out.println("Doubling done ");
			System.out.println(childsecond.getFnum() + " " + childsecond.getSnum());
			break;
		case 3:
			System.out.printf("Multiplication of %d and %d is %d", num1, num2, childsecond.multiply());
			break;

		default:
			System.out.println("Please enter correct choice ");

		}
	}

}
