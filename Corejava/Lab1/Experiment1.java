package Lab1;

import java.util.Scanner;

public class Experiment1 {
public int calculatesum(int n)
{
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(i%3==0||i%5==0)
			sum=sum+i;
	}
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Experiment1 exp=new Experiment1();
		System.out.println("Enter a no.");
		int n=sc.nextInt();
		int sum=exp.calculatesum(n);
		System.out.println("sum = "+sum);
	}

}
