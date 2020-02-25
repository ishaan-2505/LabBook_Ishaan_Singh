package Lab1;

import java.util.Scanner;

public class Experiment2 {

	public int calculateDifference(int n)
	{
		int sum1=0,sum2=0;
		for(int i=1;i<=n;i++)
		{
			sum1=sum1+i*i;
		}
		
		for(int i=1;i<=n;i++)
		{
			sum2=sum2+i;
		}
		
		sum2=sum2*sum2;
		return Math.abs(sum2-sum1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Experiment2 exp2=new Experiment2();
		int diff=exp2.calculateDifference(n);
		System.out.println(diff);
	}

}
