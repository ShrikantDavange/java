
public class Isprime {

	public void isPrime(int n) {
		// TODO Auto-generated method stub
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.printf("n%%i is %d%%%d\n", n, i);
				System.out.printf("Number %d is not a prime :D\n", n);
				break;
			} else {
				System.out.printf("Number %d is a prime", n);
			}

		}
	}

}
