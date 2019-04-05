package functionalproject;

import java.util.List;

public class MaptoLowercases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mstring = List.of("zapple", "ball", "cat");
		mstring.stream().map(s -> s.toLowerCase()).forEach(p -> System.out.println(p));

	}

}
