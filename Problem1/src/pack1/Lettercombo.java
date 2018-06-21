package pack1;

public class Lettercombo {

	private int[] digits;
	int maxlengt = 3;
	int maxhight = 8;
	int maxlengtarray = maxlengt-1;
	public Lettercombo() {

		digits = new int[maxlengt];

	}

	public Lettercombo(int i) {
		maxlengt = i;
		maxlengtarray = i-1;
		digits = new int[maxlengt];
	}

	/*
	 * public boolean comparecurrent() { for (int i = 0; i < digits.length; i++)
	 * { for (int j = i + 1; j < digits.length; j++) { if (digits[i] ==
	 * digits[j]) { return false; }
	 * 
	 * } }
	 * 
	 * return true; }
	 */
	public void fill() {
		int lengt = 0;
		int hight = 0;
		while (hight < maxhight && lengt < maxlengt) {
			digits[lengt] = hight;
			System.out.println(digits[lengt]);
			hight++;
			lengt++;

		}

	}
 
	public String convert() {
		String retval = "";
		for (int digit : digits) {
			char letter = (char) ('A' + digit);
			retval += letter;
		}
		return retval;
	}

	public boolean increment() {
		digits[maxlengtarray]++;

		for (int i = maxlengtarray; i >= 0; i--) {
			if (digits[i] > maxhight - (maxlengtarray - i)) {
				digits[i-1]++;
				for(int j = i; j < maxlengt;){
					digits[j] = digits[j-1]+1;
					j++;
				}

			}
		}
		if  (digits[maxlengtarray] > maxhight){
			
		}
			
		boolean notend;
		notend = digits[0] < (maxhight - maxlengt);
		return notend;
	}

	public void set_maxhight(int i) {
		maxhight = i;
	}
}
