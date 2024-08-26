package javaPrograms;

public class PrimeRange {

	public static void main(String[] args) {

		int n=10;
		int m=20;
		int sum=0;
		for(int i=n; i<=m; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {

				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);

				sum=sum+i;
			}
		}
		System.out.println(sum);
	}

}
