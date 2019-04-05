package genericstest;

import java.util.LinkedList;
import java.util.List;

public class Gentest {

	static <x extends List> void duplicate(x list) {
		list.addAll(list);
	}

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>(List.of(1, 2, 3));
		System.out.println("Before duplicating");
		System.out.println(numbers);

		duplicate(numbers);
		System.out.println("After duplicating");
		System.out.println(numbers);

		List<String> mylist = List.of("aaple", "ball");
		printList(mylist);
		printUsingLambda(mylist);

	}

	private static void printList(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}

	}

	private static void printUsingLambda(List list) {
		list.stream().forEach(element -> System.out.println("Element - " + element));
	}

}
