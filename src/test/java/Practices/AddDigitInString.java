package Practices;

import org.testng.annotations.Test;

public class AddDigitInString {

	

	@Test
	public void addNum() {
		String s="java12345";
		int sum=0;

		for(int i=0; i<s.length(); i++) {
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z') ){
				System.out.println(s.charAt(i));
				
				int num=Integer.parseInt(String.valueOf(s.charAt(i)));
				sum = sum + num;
			}			
		}
		System.out.println(sum);
	}
	
}
