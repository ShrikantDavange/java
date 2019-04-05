package functionalproject;

import java.util.List;

public class PrintLengthofeachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("apple", "countme");

		list.stream().map(s -> s.length()).forEach(p -> System.out.println(p));
	}

}
