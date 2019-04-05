public class Test1 {

	public static void main(String[] args) {
		/*
		 * Users user1 = new Users(); Users user2 = new Users();
		 * user2.setUsername("Mapple"); user2.setEmail("test@test.com");
		 * user1.setUsername("Apple"); user1.setEmail("test@test.com");
		 * 
		 * List<Users> l1 = new ArrayList<Users>(); l1.add(user2); l1.add(user1);
		 * System.out.println("Before\n----------");
		 * System.out.println(l1.get(0).getUsername());
		 * System.out.println(l1.get(1).getUsername());
		 * 
		 * Collections.sort(l1); System.out.println("\nafter\n---------");
		 * System.out.println(l1.get(0).getUsername());
		 * System.out.println(l1.get(1).getUsername());
		 * 
		 * ArrayList<Integer> a1 = new ArrayList<Integer>();
		 * 
		 * a1.add(12); a1.add(90); a1.add(89); Iterator<Integer> i1 = a1.iterator();
		 * while (i1.hasNext()) { System.out.println(i1.next()); }
		 */

		String test = "10001";
		System.out.println(test.getClass().getName());
		System.out.println(test.charAt(1));
		int sum = Integer.valueOf(String.valueOf(test.charAt(0))) + 1;
		System.out.println(sum);
	}
}
