package collections;

import java.util.ArrayList;
import java.util.List;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * List<student> st = List.of(new student(1, "shri"), new student(20, "Ranga"),
		 * new student(3, "Patanga")); ArrayList<student> stal = new ArrayList<>(st);
		 * System.out.println(stal); Collections.sort(stal);
		 */

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		List<ArrayList<Integer>> megalist = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> templist = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 5) {
					ArrayList<Integer> numbers = new ArrayList<>(List.of(a[i], a[j]));
					megalist.add(numbers);
					System.out.println(numbers);
					System.out.println(megalist);
				}
			}
		}
		System.out.println(megalist);

	}

}
