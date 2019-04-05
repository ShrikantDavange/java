import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> mylist = List.of('A', 'G', 'A', 'C', 'E');

		Set<Character> myset = new TreeSet<>(mylist);
		System.out.println("Treeset is " + myset);
		// Stores a sorted data

		myset = new LinkedHashSet<>(mylist);
		System.out.println("LinkedHashSet is " + myset);
		// LinkedHashset stored in the order they were inserted

		myset = new HashSet<>(Set.of('a', 'd'));
		System.out.println("Hash set is " + myset);
		// Hashset stores in random order

	}

}
