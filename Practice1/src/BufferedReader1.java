package comp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReader1 {

	

	
	public static void main(String[] args) throws IOException {
		/*File f=new File("e:/sachin.txt");
		Scanner sc=new Scanner(f);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		sc.close();*/
		InputStreamReader im=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(im);
		

System.out.println("Enter number");
		int a=Integer.parseInt(br.readLine());
		
		System.out.println(a);
		

System.out.println("Enter float");
		float b=Float.parseFloat(br.readLine());
		
		System.out.println(b);
		
		
		System.out.println("Enter string");
		String s=br.readLine();
		System.out.println(s);
		
		System.out.println("Enter character");
		char ch=(char) br.read();
		System.out.println(ch);
		
		
		
		
		
		
		
		

	}

}
