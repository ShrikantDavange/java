
public class Automata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char mystring = '9';
		String s = "ab2c2";
		String f = "";
		char[] chars = s.toCharArray();
		for (char ch : chars) {
			System.out.println(ch);
			int val = (int) ch;
			if (val >= 48 && val <= 57) {
				System.out.println("this one is number ");
				System.out.println(val);
				int temp = Character.getNumericValue(ch);

				for (int i = 1; i < temp; i++) {
					f = f + f;
				}

			} else {
				System.out.println("This one is character");
				System.out.println(ch);
				f = f + ch;
				System.out.println(f);
			}
		}

		System.out.println("Final string is " + f);

	}

}
