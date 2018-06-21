package pack1;

public class Runner {
/*
 * main starts the program off 
 */
	public static void main(String[] args) {
		computation();

	}
/*
 * runs  throught each posable sultion  saves them in an array as well as pringint to console
 * after which it calculates total number of sulltions and printes that befor returing it to main 
 * @testans array of saved suutions
 * @temp  tempary interger for  icrementing  thetest ans array
 * @anser  stores the total number of sulutions 
 */
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

/*
 * runs through all saved ansers within the aray and then returns that number 
 * @count  int wihch is incremented each time a sulution is shown 
 */
	private static int getLength(String[] testans) {
		int count = 0;
		for (Object el : testans)
			if (el != null)
				++count;
		return count;

	}



}