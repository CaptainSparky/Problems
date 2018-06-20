package pack1;

public class Runner {

	public static void main(String[] args) {
		computation();

	}

	static int computation() {

		String[] testans = new String[100000];
		Lettercombo lettercombo = new Lettercombo();
		lettercombo.fill();
		int temp = 0;
		do {
			testans[temp] = lettercombo.convert();
			System.out.println(testans[temp]);
			temp++;

		} while (lettercombo.increment());

		System.out.println("got here");
		int anser = getLength(testans);
		System.out.println(anser);
		return anser;

	}


	private static int getLength(String[] testans) {
		int count = 0;
		for (Object el : testans)
			if (el != null)
				++count;
		return count;

	}

	// set up the no of variables

}