package Interview;

import java.util.Scanner;

public class EvenProgram {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		if(n>=0 ) {
			
		if(n%2==0) {
			System.out.println("even number");
		}
		
		else {
			System.out.println("old number");
		}
		}
		else {
			System.out.println("enter valid number");
		}
		}	

	}



