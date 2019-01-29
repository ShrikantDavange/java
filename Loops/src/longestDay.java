public class longestDay {

	void calday(String[] days) {
		for (String day : days) {
			System.out.println(day.length());
		}

	}

	void revertdays(String[] days) {
		for (int i = (days.length - 1); i >= 0; i--) {

			System.out.println(days[i]);
		}

	}

}
