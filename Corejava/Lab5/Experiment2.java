package Lab5;

import java.util.Scanner;

public class Experiment2 {
	public int fib(int n)
	{
		if(n==0)
			return 1;
		else
			if(n==1)
				return 1;
			else
				return fib(n-1)+fib(n-2);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		Experiment2 exp=new Experiment2();
		int t=exp.fib(sc.nextInt());
	}

}
