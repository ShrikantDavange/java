import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComprator implements Comparator<String> {

	@Override
	public int compare(String l1, String l2) {

		return Integer.compare(l1.length(), l2.length());
	}

}

public class QueueRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>(new StringLengthComprator());
		queue.addAll(List.of("Apple", "Cat", "wall", "Ball"));
		System.out.println(queue);
	}

}
