package Practices;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class csvfileData {

	public static void main(String[] args) {
		
		try {
			Scanner sc=new Scanner(new File("C:\\Users\\kmadh\\Downloads\\Book3.csv"));
			sc.useDelimiter(",");
			
			while(sc.hasNext())
			{
				System.out.println(sc.next().toString());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
