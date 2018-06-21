package pack1;

public class Lettercombo {
/*
 * @maxlengt is the number of digits within the  combo anser
 * @maxhight is the number of digits which the combo can use
 * @maxlengtarray  is the digit within the array
 */
	private int[] digits;
	int maxlengt = 3;
	int maxhight = 8;
	int maxlengtarray = maxlengt-1;
	
/*
 * this starts an new array for holding/ calculating  the combos
 * 	
 */
	public Lettercombo() {

		digits = new int[maxlengt];

	}
/*
 * this starts an array for holding/calculating the combos but is variable length of combo
 */
	public Lettercombo(int i) {
		maxlengt = i;
		maxlengtarray = i-1;
		digits = new int[maxlengt];
	}

/*
 * fill  takes the empty starting array and places the intial combo of 123.. within it this will sacle with  array length and hight
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
 /*
  * takes the digits from within the array and sorts them into the required alhabet  order befor returning them 
  * @retval  string for storing the combo in letters
  */
	public String convert() {
		String retval = "";
		for (int digit : digits) {
			char letter = (char) ('A' + digit);
			retval += letter;
		}
		return retval;
	}
/*
 * this increments the final value within the array befor cheaking that none of the values are grater than the maxhight
 * if one exiudes it will increment the  value to the left it then rest each after to stay inline with the combo sorting
 * it will then cheak that the first digit dose not exuide the posable maximum befor returning if it dose or not
 * @not end  cheaks the the digit in the first slot of the array has not exiuded the posable maximum befor
 */
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

			
		boolean notend;
		notend = digits[0] < (maxhight - maxlengt);
		return notend;
	}


}
