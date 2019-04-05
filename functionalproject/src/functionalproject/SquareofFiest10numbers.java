package functionalproject;

import java.util.stream.IntStream;

public class SquareofFiest10numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream.range(1, 10).map(e -> e * e).forEach(p -> System.out.println(p));
	}

}
