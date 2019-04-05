package functionalproject;

import java.util.List;

public class FunRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = List.of(1, 2, 3, 4, 5);

		printwithFunctionalprog(list);
	}

	private static void printwithFunctionalprog(List<Integer> list) {
		list.stream().filter(element -> element % 2 == 0).forEach(element -> System.out.println(element));
	}
}
