package Interview;


import java.util.Scanner;

public class demo {
	
	public static int revString(String s) {
		int sum=0;
		for(int i=0; i<=s.length()-1; i++ ) {
			
			if(!(s.charAt(i)>='a' && s.charAt(i)<='z')) {
				
				int s1=Character.getNumericValue(s.charAt(i));
				System.out.println(s1);
				sum=sum+s1;
				//System.out.println(sum);
				
			}
		}
		return sum;
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int s1=revString(str);
		System.out.println(s1);
        
	}
	
	
	
    
	

}
