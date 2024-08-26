package javaPrograms;

public class String_demo {

	public static void main(String[] args) {
		
		String s= "i am String";
		String st = s.replace(" ", "");
		
		//g ni rtsmai
		int j= st.length()-1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				System.out.print(st.charAt(j--));
			}
			else {
				System.out.print(s.charAt(i));
			}
		}
		
		
	}
}
