package pack1;

import java.util.Arrays;

public class Lettercombo {

	private int[] digits;
	int maxlengt = 3;
	int maxhight = 8;

	public Lettercombo() {

		digits = new int[maxlengt];
	}
	/*
	public boolean comparecurrent() {
		for (int i = 0; i < digits.length; i++) {
			for (int j = i + 1; j < digits.length; j++) {
				if (digits[i] == digits[j]) {
					return false;
				}

			}
		}

		return true;
	}
*/
	public void fill(int hight) {
		int lengt= 0;
		if(hight < 0){
			hight = 0;
		}
		while (hight <= maxhight && lengt < maxlengt ){
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
			System.out.println(retval);
		}
		return retval;
	}
	
	public boolean increment() {
		
		
		
		/*
		digits[maxlengt - 1]++;
		for (int i = digits.length - 1; i > 0; i--) {
			if (digits[i] > maxhight) {
				digits[i - 1]++;
				if (digits[0] > maxhight) {
					return false;
				} else {
					digits[i] = 0;
				}

			}
		}
*/
		return true;
	}


}
