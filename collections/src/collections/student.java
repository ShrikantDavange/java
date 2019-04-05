package collections;

public class student implements Comparable<student> {
	private int id;
	private String name;

	public student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString() {
		return String.format("id is %d and name is %s", id, name);
	}

	@Override
	public int compareTo(student that) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, that.id);
	}
}
