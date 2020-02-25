package Lab5;

import java.util.Scanner;

public class Experiment5 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int age;
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age<15)
			throw new Exception("Age cant be below 15");
	}

}
