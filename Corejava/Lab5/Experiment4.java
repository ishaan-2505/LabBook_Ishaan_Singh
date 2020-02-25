package Lab5;

import java.util.Scanner;

import javax.naming.NamingException;

public class Experiment4 {

	public static void main(String[] args) throws Exception {
		String fName="";
		String lName="";
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name and last name of an employee");
		try {
			fName=sc.next();
			lName=sc.next();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
