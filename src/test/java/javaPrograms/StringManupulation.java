package javaPrograms;

public class StringManupulation {
/*
 * reverse the word
 */
	public String revStringWord(String strp) {

		String[] s1 = strp.split(" ");
		String temp = "";

		for (int i = s1.length - 1; i >= 0; i--) {
			temp = temp + s1[i] + " ";
		}
		return temp;
	}
	/*
	 * reverse last word
	 */

	public String reverseLastword(String str) {
		String tmp = "";
		String[] s1 = str.split(" ");

		for (int i = 0; i < s1.length - 1; i++) {
			tmp = tmp + s1[i] + " ";
		}
		String lastword = s1[s1.length - 1];
		String rev = "";
		for (int i = lastword.length() - 1; i >= 0; i--) {
			rev = rev + lastword.charAt(i);
		}
		return tmp + rev;
	}

	/*
	 * covert lower to upper and upper to lower
	 */
	public String reverseCase(String abc) {
		String xyz = "";
		for (int i = 0; i < abc.length(); i++) {
			char t = abc.charAt(i);
			if (Character.isUpperCase(t)) {
				String s1 = String.valueOf(t).toLowerCase();
				xyz = xyz + s1;
			} else {
				String s1 = String.valueOf(t).toUpperCase();
				xyz = xyz + s1;
			}

		}
		return xyz;
	}

	/*
	 * add only integer number and remove string
	 */
	public int addNum(String s) {
		
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
				int num = Integer.parseInt(String.valueOf(s.charAt(i)));
				//int num=Character.getNumericValue(s.charAt(i));
				sum = sum + num;
			}
		}
		
		return sum;
	}

	public static void main(String[] args) {

		StringManupulation sm = new StringManupulation();
		/* 1st */
		String str = "madhuri kumari hai";
		String s1 = sm.revStringWord(str);
		System.out.println(s1);

		/* 2nd */
		System.out.println(sm.reverseLastword(str));

		/* 3rd */
		String caseConvert = "AJAYanupmaFIJO";
		System.out.println(sm.reverseCase(caseConvert));

		/* 4th */
		String s = "java12345";
		System.out.println(sm.addNum(s));
	}

}
